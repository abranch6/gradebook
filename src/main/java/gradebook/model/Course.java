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
    private GradebookDB<Class> classes;

    public Course(String subject, String name, int number) {
        this.subject = subject;
        this.name = name;
        this.number = number;
        prerequisites = new ArrayListDB<Course>();
        classes = new ArrayListDB<Class>();
    }

    public int reportAverageScore() {
        int average = 0;
        Class[] allClasses = classes.toArray(new Class[1]);

        for (int i = 0; i < allSections.length; i++) {
            average += allClasses[i].reportAverageScore();
        }

        average /= allClasses.length;
        return average;
    }

    public char reportLetterGrade() {
        int average = 0;
        char sectionLetterGrade = 0;
        Class[] allClasses = classes.toArray(new Section[1]);

        for (int i = 0; i < allClasses.length; i++) {
            sectionLetterGrade = allClasses[i].reportAverageLetterGrade();

            if (sectionLetterGrade == 'F') {
                sectionLetterGrade--;
            }
            average += sectionLetterGrade;
        }

        average /= allClasses.length;
        if (average == 'E') {
            average++;
        }

        return (char) average;

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
