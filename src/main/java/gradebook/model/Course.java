package gradebook.model;

/**
* A Course that is offered
* @author Andrew Branch
*/
public class Course implements Storable {
    private String subject;
    private String name;
    private int number;
    private GradebookDB<Course> prerequisites;

    public Course(String subject, String name, int number) {
        this.subject = subject;
        this.name = name;
        this.number = number;
        prerequisites = new ArrayListDB<Course>();
    }

    public boolean equals(Course that) {
        boolean subjectEquals = subject.equals(that.subject);
        boolean numberEquals = number == that.number;

        return  subjectEquals && numberEquals && name.equals(that.name);
    }

    public int hashCode() {
        return number;
    }

    public String getId() {
        return name;
    }
}
