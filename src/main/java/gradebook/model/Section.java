package gradebook.model;

public class Section implements Storable{
    
    private GradebookDB students;
    
    public Section(GradebookDB<Student> students) {
        this.students = students;
    }

    public final int reportAverageScore() {
        int average = 0;
         
        for (int i = 0; i < students.size(); i++) {
 //           average += students[i].reportScore();
        }

        average /= students.size();
        return average;
    }
     
    public final char reportAverageLetterGrade() {
        int average = 0;
        for (int i = 0; i < students.size(); i++) {
            char studentLetterGrade = ' ';
  //          studentLetterGrade += students[i].reportLetterGrade();

            if (studentLetterGrade == 'F') {
                studentLetterGrade--;
            }
            average = studentLetterGrade;
        }

        average /= students.size();
        if (average == 'E') {
            average++;
        }

        return (char) average;
    }
    
    public String getId()
    {
        return "";
    }
}
