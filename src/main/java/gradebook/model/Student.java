package gradebook.model;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<GradebookItem> gradebook;
    private GradingScheme scheme;

    public Student(final String name) {
        this.name = name;
        gradebook = new ArrayList<GradebookItem>();
    }

    public int reportScore() {
        return scheme.calculateScore(gradebook);
    }

    public char reportLetterGrade() {
        return scheme.calculateLetterGrade(gradebook);
    }

    public boolean equals(Student that)
    {
        return name.equals(that.name)
    } 
}
