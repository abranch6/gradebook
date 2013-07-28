package gradebook.model;

public class GradebookItem {
    private String name;
    private GradebookCategory category;

    public GradebookItem(String name, GradebookCategory category) {
        this.name = name;
        this.category = category;
    }

    public boolean equals(GradebookItem that)
    {
        return name.equals(that.name) && category.equals(that.category);
    }
}
