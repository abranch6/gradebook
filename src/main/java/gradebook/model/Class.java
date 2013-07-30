package gradebook.model;

/**
* Represents a Class of a Course which stores Sections
* @author Andrew Branch
*/
public class Class extends Gradable implements Storable {

    private GradebookDB<Section> sections;

    public Class() {
        this(new ArrayListDB<Section>());
    }

    public Class(GradebookDB<Section> sections) {
        this.sections = sections;
    }

    protected Gradable[] getGrades() {
        return sections.toArray(new Section[1]);
    }

    public void addSection(Section section) {
        sections.put(section);
    }

    public String getId() {
        return "";
    }
}
