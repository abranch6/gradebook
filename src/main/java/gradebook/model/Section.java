package gradebook.model;

public class Section {
    private Student[] students;

    public Section(final Student[] students) {
        this.students = students;
    }

    public final int reportAverageScore() {
        int average = 0;
 
        for (int i = 0; i < students.length; i++) {
            average += students[i].reportScore();
        }

        average /= students.length;
        return average;
    }
     
    public final char reportAverageLetterGrade() {
        int average = 0;
        for (int i = 0; i < students.length; i++) {
            char studentLetterGrade = ' ';
            studentLetterGrade += students[i].reportLetterGrade();

            if (studentLetterGrade == 'F') {
                studentLetterGrade--;
            }
            average = studentLetterGrade;
        }

        average /= students.length;
        if (average == 'E') {
            average++;
        }

        return (char) average;
    }
}
