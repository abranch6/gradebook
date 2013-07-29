package gradebook.model;

import java.util.ArrayList;

public class Student implements Storable{
    private String name;
    private GradebookDB<GradebookItem> gradebook;
    private GradingScheme scheme;

    public Student(final String name) {
        this.name = name;
        scheme = new NormalGradingScheme();
        gradebook = new ArrayListDB<GradebookItem>(); 
    }
    
    public int reportScore() {
        return scheme.calculateScore(gradebook);
    }

    public char reportLetterGrade() {
        return scheme.calculateLetterGrade(gradebook);
    }

    public void addGradebookItem(GradebookItem item)
    {
            gradebook.put(item);
    }

    public boolean equals(Student that)
    {
        return name.equals(that.name);
    }

    public String getId()
    {
        return name;
    } 
}
