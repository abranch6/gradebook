package gradebook.model;

import java.util.ArrayList;

public interface GradingScheme
{
    char calculateLetterGrade(GradebookDB<GradebookItem> gradebook);
    int calculateScore(GradebookDB<GradebookItem> gradebook);
}
