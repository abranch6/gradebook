package gradebook.model;

public abstract class Gradable {

    public abstract Gradable[] getGrades();

    public int reportScore() {
        int average = 0;
        Gradable[] grades = getGrades();

        for (int i = 0; i < grades.length; i++) {
            average += grades[i].reportScore();
        }

        average /= grades.length;
        return average;
    }

    public char reportLetterGrade() {
        int average = 0;
        char letterGrade = 0;
        Gradable[] grades = grades.toArray(new Section[1]);
    
        for (int i = 0; i < grades.length; i++) {
            letterGrade = grades[i].reportLetterGrade();
        
            if (letterGrade == 'F') {
                letterGrade--;
            }
            average += letterGrade;
        }

        average /= grades.length;
        if (average == 'E') {
            average++;
        }

        return (char) average;

    }
}
