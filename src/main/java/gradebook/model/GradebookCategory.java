package gradebook.model;

public class GradebookCategory {
    private String name;
    private double weight;

    public GradebookCategory(final String name, final double weight) {
        this.name = name;
        this.weight = weight;
    }
    
    public double getWeight()
    {
        return weight;
    }

    public boolean equals(GradebookCategory that) {
        return name.equals(that.name) && weight == that.weight;

    }
    
}
