package gradebook.model;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ArrayListDBTest {
    @Test
    public void testPutandGet() {
        Student student = new Student("John Doe");
        GradebookDB<Student> list = new ArrayListDB<Student>();
        list.put(student);
        Student s = list.get("John Doe");
        assertEquals(student, s);
    }

    @Test
    public void testDelete() {
        Student student = new Student("John Doe");
        GradebookDB<Student> list = new ArrayListDB<Student>();
        list.put(student);

        Student s = list.get("John Doe");
        assertEquals(student, s);

        list.delete(student);
        s = list.get("John Doe");  
        assertEquals(null, s);
    }

    @Test
    public void testToArray() {
        Student student1 = new Student("John Doe");
        Student student2 = new Student("Andrew Branch");
        Student student3 = new Student("Jane Doe");

        GradebookDB<Student> list = new ArrayListDB<Student>();
        list.put(student1);
        list.put(student2);
        list.put(student3);
    
        Student[] students = list.toArray(new Student[1]);
        assertEquals(student1, students[0]);
        assertEquals(student2, students[1]);
        assertEquals(student3, students[2]);
    }
}
