package gradebook.model;

import java.util.HashMap;

/**
* Implements a normal grading scheme
* @author Andrew Branch
*/
public class NormalGradingScheme implements GradingScheme {

    private final int aScore = 90;
    private final int bScore = 80;
    private final int cScore = 70;
    private final int dScore = 60;

    public char calculateLetterGrade(GradebookDB<GradebookItem> gradebook) {
        int score = calculateScore(gradebook);

        if (score >= aScore) {
            return 'A';
        } else if (score >= bScore) {
            return 'B';
        } else if (score >= cScore) {
            return 'C';
        } else if (score >= dScore) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public int calculateScore(GradebookDB<GradebookItem> gradebook) {
        GradebookItem[] items = gradebook.toArray(new GradebookItem[1]);
        HashMap<GradebookCategory, Integer> itemMap;
        itemMap = new HashMap<GradebookCategory, Integer>();
        HashMap<GradebookCategory, Integer> amtMap;
        amtMap = new HashMap<GradebookCategory, Integer>();
        int total = 0;

        for (int i = 0; i < items.length; i++) {
            GradebookCategory currentCategory = items[i].getCategory();
            Integer currentVal = itemMap.get(currentCategory);
            Integer amountValue = amtMap.get(currentCategory);

            if (currentVal == null) {
                itemMap.put(currentCategory, items[i].getScore());
                amtMap.put(currentCategory, 1);
            } else {
                itemMap.put(currentCategory, items[i].getScore() + currentVal);
                amtMap.put(currentCategory, amountValue + 1);
            }
        }
        GradebookCategory[] categories;
        categories = itemMap.keySet().toArray(new GradebookCategory[1]);

        for (int i = 0; i < categories.length; i++) {
            int temp = (itemMap.get(categories[i]) / amtMap.get(categories[i]));
            total += temp * categories[i].getWeight();
        }

        return total;
    }
}
