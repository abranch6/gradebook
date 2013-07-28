package gradebook.model;

public class Class implements Storable{
    Course course;
    GradebookDB<Section> sections;
        
    public Class(Course course, GradebookDB<Section> sections) {
        this.course = course;
        this.sections = sections;
    }
 
    public int reportAverageScore() {
        int average = 0;

        for(int i = 0; i < sections.size(); i++)
        {
            average += sections[i].reportAverageScore();
        }

        average /= sections.size();
        return average;
    }

    public char reportLetterGrade() {
        int average = 0;
        for(int i = 0; i < sections.size(); i++) {
            char sectionLetterGrade = ' ';
            sectionLetterGrade += sections[i].reportAverageLetterGrade();

            if(sectionLetterGrade == 'F') {
                sectionLetterGrade--;
            }
            average = sectionLetterGrade;
        }

        average /= sections.size();
        if(average == 68) {
            average++;
        }

        return (char)average;

    }

    public String getId()
    {
        return "";
    }
}
