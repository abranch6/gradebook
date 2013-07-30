package gradebook.model;

public class Section implements Storable{
    
    private GradebookDB<Student> students;
    
    public Section()
    {
        this(new ArrayListDB<Student>());
    }

    public Section(GradebookDB<Student> students) {
        this.students = students;
    }

    public final int reportAverageScore() {
        int average = 0;
        Student[] allStudents = students.toArray(new Student[1]);

        for (int i = 0; i < allStudents.length; i++) {
            average += allStudents[i].reportScore();
        }

        average /= allStudents.length;
        return average;
    }
     
    public final char reportAverageLetterGrade() {
        int average = 0;
        Student[] allStudents = students.toArray(new Student[1]);
        char studentLetterGrade = 0;
        for (int i = 0; i < allStudents.length; i++) {
            studentLetterGrade = allStudents[i].reportLetterGrade();

            if (studentLetterGrade == 'F') {
                studentLetterGrade--;
            }
            average += studentLetterGrade;
        }

        average /= allStudents.length;
        if (average == 'E') {
            average++;
        }

        return (char) average;
    }
  
    public void getStudent(String student)
    {
        students.get(student);  
    }
 
    public void addStudent(Student student)
    {
        students.put(student);
    }
 
    public String getId()
    {
        return "";
    }
}
