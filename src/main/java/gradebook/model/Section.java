package gradebook.model;

/**
* A section of a class that is contained in a class
* @author Andrew Branch
*/
public class Section extends Gradable implements Storable {

    private GradebookDB<Student> students;

    public Section() {
        this(new ArrayListDB<Student>());
    }

    public Section(GradebookDB<Student> students) {
        this.students = students;
    }

    protected Gradable[] getGrades() {
        return students.toArray(new Student[1]);
    }

    public void getStudent(String student) {
        students.get(student);
    }

    public void addStudent(Student student) {
        students.put(student);
    }

    public String getId() {
        return "";
    }
}
