package gradebook.model;

import java.util.ArrayList;

public interface GradingScheme
{
    char calculateLetterGrade(ArrayList<GradebookItem> gradebook);
    int calculateScore(ArrayList<GradebookItem> gradebook);
}
