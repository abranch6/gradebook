package gradebook.model;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class StudentTest
{
    @Test
    public void testReportScore()
    {
        Student student = new Student("John Doe");
        GradebookCategory tests = new GradebookCategory("Tests", 0.6);
        GradebookCategory homework = new GradebookCategory("Homework", 0.4);
        student.addGradebookItem(new GradebookItem("Test 1", tests, 100));
        student.addGradebookItem(new GradebookItem("Test 1", tests, 80));
        student.addGradebookItem(new GradebookItem("Homework 1", homework, 100));
        student.addGradebookItem(new GradebookItem("Homework 2", homework, 95));
        student.addGradebookItem(new GradebookItem("Homework 3", homework, 80));
        
        assertEquals(student.reportScore(), (int)(90 * 0.6 + 91 * 0.4));  
    }

    @Test
    public void testReportLetterGrade()
    {
        Student student = new Student("John Doe");
        GradebookCategory tests = new GradebookCategory("Tests", 0.6);
        GradebookCategory homework = new GradebookCategory("Homework", 0.4);
        student.addGradebookItem(new GradebookItem("Test 1", tests, 100));
        student.addGradebookItem(new GradebookItem("Test 1", tests, 80));
        student.addGradebookItem(new GradebookItem("Homework 1", homework, 100));
        student.addGradebookItem(new GradebookItem("Homework 2", homework, 95));
        student.addGradebookItem(new GradebookItem("Homework 3", homework, 80));

        assertEquals('A', student.reportLetterGrade());
    }
}
