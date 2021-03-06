package gradebook.model;

/**
*
* @author Andrew Branch
*/
public class GradebookItem implements Storable {
    private String name;
    private GradebookCategory category;
    private int score;

    public GradebookItem(String name, GradebookCategory category, int score) {
        this.name = name;
        this.category = category;
        this.score = score;
    }

    public GradebookCategory getCategory() {
        return category;
    }

    public int getScore() {
        return score;
    }

    public boolean equals(GradebookItem that) {
        return name.equals(that.name) && category.equals(that.category);
    }

    public int hashCode() {
        return name.hashCode();
    }

    public String getId() {
        return name;
    }
}
