package gradebook.model;

/**
* Defines how to create a grading scheme
* @author Andrew Branch
*/
public interface GradingScheme {
    char calculateLetterGrade(GradebookDB<GradebookItem> gradebook);
    int calculateScore(GradebookDB<GradebookItem> gradebook);
}
