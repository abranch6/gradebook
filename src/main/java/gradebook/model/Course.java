package gradebook.model;

public class Course implements Storable
{
    String subject;
    String name;
    int number;
    GradebookDB<Course> prerequisites;

    public Course(String subject, String name, int number, GradebookDB<Course> prerequisites)
    {
        this.subject = subject;
        this.name = name;
        this.number = number;
        this.prerequisites = prerequisites;
    }

    public boolean equals(Course that)
    {
        return subject.equals(that.subject) && number == that.number && name.equals(that.name);
    }

    public String getId()
    {
        return name;
    }
}
