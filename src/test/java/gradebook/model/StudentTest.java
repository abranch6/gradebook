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
    }     
}
