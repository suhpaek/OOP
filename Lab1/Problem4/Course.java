package Problem4;

import java.util.List;
import java.util.ArrayList;


public class Course {
    private String name;
    private String description;
    private int credits;
    private List<String> prerequisites;

    public Course(String name, String description, int credits, List<String> prerequisites) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisites = (prerequisites == null) ? new ArrayList<>() : new ArrayList<>(prerequisites);
    }

    public Course(String name, int credits){
        this(name, "", credits, new ArrayList<>());
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return "Course{name='" + name + "', credits=" + credits + ", description= '" + description + "', prerequisites=" + prerequisites + "}";

    }

}
