package gradebook.model;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class SectionTest
{
    @Test
    public void testReportAverageScore()
    {
        Section section = new Section();
 
        GradebookCategory tests = new GradebookCategory("Tests", 0.6);
        GradebookCategory homework = new GradebookCategory("Homework", 0.4);

        Student student1 = new Student("John Doe");
        student1.addGradebookItem(new GradebookItem("Test 1", tests, 70));
        student1.addGradebookItem(new GradebookItem("Test 1", tests, 70));
        student1.addGradebookItem(new GradebookItem("Homework 1", homework, 75));
        student1.addGradebookItem(new GradebookItem("Homework 2", homework, 75));
        student1.addGradebookItem(new GradebookItem("Homework 3", homework, 75));

        Student student2 = new Student("Jane Doe");
        student2.addGradebookItem(new GradebookItem("Test 1", tests, 80));
        student2.addGradebookItem(new GradebookItem("Test 1", tests, 80));
        student2.addGradebookItem(new GradebookItem("Homework 1", homework, 90));
        student2.addGradebookItem(new GradebookItem("Homework 2", homework, 90));
        student2.addGradebookItem(new GradebookItem("Homework 3", homework, 90));


        Student student3 = new Student("John Smith");
        student3.addGradebookItem(new GradebookItem("Test 1", tests, 100));
        student3.addGradebookItem(new GradebookItem("Test 1", tests, 100));
        student3.addGradebookItem(new GradebookItem("Homework 1", homework, 100));
        student3.addGradebookItem(new GradebookItem("Homework 2", homework, 100));
        student3.addGradebookItem(new GradebookItem("Homework 3", homework, 100));

        section.addStudent(student1);
        section.addStudent(student2);
        section.addStudent(student3);

        assertEquals((int)(((70 * 0.6 + 75 * 0.4) + (80 * 0.6 + 90 * 0.4) + 100) / 3), section.reportAverageScore()); 
    }

    @Test
    public void testReportAverageLetterGrade()
    {
        Section section = new Section();

        GradebookCategory tests = new GradebookCategory("Tests", 0.6);
        GradebookCategory homework = new GradebookCategory("Homework", 0.4);

        Student student1 = new Student("John Doe");
        student1.addGradebookItem(new GradebookItem("Test 1", tests, 70));
        student1.addGradebookItem(new GradebookItem("Test 1", tests, 70));
        student1.addGradebookItem(new GradebookItem("Homework 1", homework, 75));
        student1.addGradebookItem(new GradebookItem("Homework 2", homework, 75));
        student1.addGradebookItem(new GradebookItem("Homework 3", homework, 75));

        Student student2 = new Student("Jane Doe");
        student2.addGradebookItem(new GradebookItem("Test 1", tests, 80));
        student2.addGradebookItem(new GradebookItem("Test 1", tests, 80));
        student2.addGradebookItem(new GradebookItem("Homework 1", homework, 90));
        student2.addGradebookItem(new GradebookItem("Homework 2", homework, 90));
        student2.addGradebookItem(new GradebookItem("Homework 3", homework, 90));


        Student student3 = new Student("John Smith");
        student3.addGradebookItem(new GradebookItem("Test 1", tests, 100));
        student3.addGradebookItem(new GradebookItem("Test 1", tests, 100));
        student3.addGradebookItem(new GradebookItem("Homework 1", homework, 100));
        student3.addGradebookItem(new GradebookItem("Homework 2", homework, 100));
        student3.addGradebookItem(new GradebookItem("Homework 3", homework, 100));

        section.addStudent(student1);
        section.addStudent(student2);
        section.addStudent(student3);

        assertEquals('B', section.reportAverageLetterGrade()); 
    }
}
