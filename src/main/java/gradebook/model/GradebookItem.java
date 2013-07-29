package gradebook.model;

public class GradebookItem implements Storable{
    private String name;
    private GradebookCategory category;
    private int score;

    public GradebookItem(String name, GradebookCategory category) {
        this.name = name;
        this.category = category;
    }

    public GradebookCategory getCategory()
    {
        return category;
    }

    public int getScore()
    {
        return score;
    }

    public boolean equals(GradebookItem that)
    {
        return name.equals(that.name) && category.equals(that.category);
    }

    public String getId()
    {
        return name;
    }
}
