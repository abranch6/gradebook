package gradebook.model;

/**
* A student that can hold gradebook items and calculate grades
* @author Andrew Branch
*/
public class Student extends Gradable implements Storable {
    private String name;
    private GradebookDB<GradebookItem> gradebook;
    private GradingScheme scheme;

    public Student(final String name) {
        this(name, new NormalGradingScheme());
    }

    public Student(final String name, GradingScheme scheme) {
        this.name = name;
        this.scheme = scheme;
        gradebook = new ArrayListDB<GradebookItem>();
    }

    public int reportScore() {
        return scheme.calculateScore(gradebook);
    }

    public char reportLetterGrade() {
        return scheme.calculateLetterGrade(gradebook);
    }

    public void addGradebookItem(GradebookItem item) {
        gradebook.put(item);
    }

    public void removeGradebookItem(String id) {
        gradebook.delete(gradebook.get(id));
    }

    public boolean equals(Student that) {
        return name.equals(that.name);
    }

    public int hashCode() {
        return name.hashCode();
    }

    public String getId() {
        return name;
    }
}
