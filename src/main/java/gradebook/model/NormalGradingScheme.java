package gradebook.model;

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
         
    }
}
