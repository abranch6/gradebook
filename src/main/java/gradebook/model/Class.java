package gradebook.model;

/**
* Represents a Class of a Course which stores Sections
* @author Andrew Branch
*/
public class Class implements Storable {

    private Course course;
    private GradebookDB<Section> sections;

    public Class(Course course) {
        this(course, new ArrayListDB<Section>());
    }

    public Class(Course course, GradebookDB<Section> sections) {
        this.course = course;
        this.sections = sections;
    }

    public int reportAverageScore() {
        int average = 0;
        Section[] allSections = sections.toArray(new Section[1]);

        for (int i = 0; i < allSections.length; i++) {
            average += allSections[i].reportAverageScore();
        }

        average /= allSections.length;
        return average;
    }

    public char reportLetterGrade() {
        int average = 0;
        char sectionLetterGrade = 0;
        Section[] allSections = sections.toArray(new Section[1]);

        for (int i = 0; i < allSections.length; i++) {
            sectionLetterGrade = allSections[i].reportAverageLetterGrade();

            if (sectionLetterGrade == 'F') {
                sectionLetterGrade--;
            }
            average += sectionLetterGrade;
        }

        average /= allSections.length;
        if (average == 'E') {
            average++;
        }

        return (char) average;

    }

    public void addSection(Section section) {
        sections.put(section);
    }

    public String getId() {
        return "";
    }
}
