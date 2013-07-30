package gradebook.model;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class NormalGradingSchemeTest
{
    @Test
    public void testReportScore()
    {
        GradingScheme scheme = new NormalGradingScheme();
        GradebookDB<GradebookItem> gradebook = new ArrayListDB<GradebookItem>();
        GradebookCategory tests = new GradebookCategory("Tests", 0.6);
        GradebookCategory homework = new GradebookCategory("Homework", 0.4);

        gradebook.put(new GradebookItem("Test 1", tests, 100));
        gradebook.put(new GradebookItem("Test 1", tests, 80));
        gradebook.put(new GradebookItem("Homework 1", homework, 100));
        gradebook.put(new GradebookItem("Homework 2", homework, 95));
        gradebook.put(new GradebookItem("Homework 3", homework, 80));

        assertEquals((int)(90 * 0.6 + 91 * 0.4), scheme.calculateScore(gradebook));
    }

    @Test
    public void testReportLetterGrade()
    {
        GradingScheme scheme = new NormalGradingScheme();
        GradebookDB<GradebookItem> gradebook = new ArrayListDB<GradebookItem>();
        GradebookCategory tests = new GradebookCategory("Tests", 0.6);
        GradebookCategory homework = new GradebookCategory("Homework", 0.4);

        gradebook.put(new GradebookItem("Test 1", tests, 100));
        gradebook.put(new GradebookItem("Test 1", tests, 80));
        gradebook.put(new GradebookItem("Homework 1", homework, 100));
        gradebook.put(new GradebookItem("Homework 2", homework, 95));
        gradebook.put(new GradebookItem("Homework 3", homework, 80));

        assertEquals('A', scheme.calculateLetterGrade(gradebook));
    }
}
