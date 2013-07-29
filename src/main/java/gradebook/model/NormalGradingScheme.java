package gradebook.model;

import java.util.HashMap;
import java.util.Set;

public class NormalGradingScheme implements GradingScheme
{
    public char calculateLetterGrade(GradebookDB<GradebookItem> gradebook)
    {
        int score = calculateScore(gradebook);
        
        if(score >= 90)
        {
            return 'A';
        }
        else if(score >= 80)
        {
            return 'B';
        }
        else if(score >= 70)
        {
            return 'C';
        }
        else if(score >= 60)
        {
            return 'D';
        }
        else
        {
            return 'F';
        }
    }
    
    public int calculateScore(GradebookDB<GradebookItem> gradebook)
    {
        GradebookItem[] items = gradebook.toArray();
        HashMap<GradebookCategory, Integer> itemMap = new HashMap<GradebookCategory, Integer>();
        HashMap<GradebookCategory, Integer> amountMap = new HashMap<GradebookCategory, Integer>();
        int total = 0;

        for(int i = 0; i < items.length; i++)
        {
            GradebookCategory currentCategory = items[i].getCategory();
            Integer currentValue = itemMap.get(currentCategory);
            Integer amountValue = amountMap.get(currentCategory);
            if(currentValue != null)
            {
                itemMap.put(currentCategory, items[i].getScore());
                amountMap.put(currentCategory, 1);
            }
            else
            {
                itemMap.put(currentCategory,items[i].getScore() + currentValue);
                amountMap.put(currentCategory, amountValue + 1); 
            }
        }
        GradebookCategory[] categories = null;
        categories = itemMap.keySet().toArray(categories);
        
        for(int i = 0; i < categories.length; i++)
        {
            total+= (itemMap.get(categories[i]) / amountMap.get(categories[i]))  * categories[i].getWeight();
        }
         
        return total; 
    }
}
