package gradebook.model;

public class Class {
    Course course;
    Section[] sections;
        
    public Class(Course course, Section[] sections) {
        this.course = course;
        this.sections = sections;
    }
 
    int reportAverageScore() {
        int average = 0;

        for(int i = 0; i < sections.length; i++)
        {
            average += sections[i].reportAverageScore();
        }

        average /= sections.length;
        return average;
    }

    char reportLetterGrade() {
        int average = 0;
        for(int i = 0; i < sections.length; i++) {
            char sectionLetterGrade = ' ';
            sectionLetterGrade += sections[i].reportAverageLetterGrade();

            if(sectionLetterGrade == 'F') {
                sectionLetterGrade--;
            }
            average = sectionLetterGrade;
        }

        average /= sections.length;
        if(average == 68) {
            average++;
        }

        return (char)average;

    }
}
