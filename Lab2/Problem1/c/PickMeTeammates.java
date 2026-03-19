package Problem1.c;

import java.util.Objects;

public class PickMeTeammates {
    private String name;
    private String id;
    private int course;

    public PickMeTeammates(String name, String id, int course){
        this.name = name;
        this.id = id;
        this.course = course;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public int getCourse(){
        return course;
    }

    public void setCourse(int course){
        this.course = course;
    }

    @Override
    public String toString(){
        return "Name: " + getName() +
                "ID: " + getId() +
                "Course: " + getCourse();
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(!(o instanceof PickMeTeammates)){
            return false;
        }

        PickMeTeammates p = (PickMeTeammates) o;

        return course == p.course &&
                id.equals(p.id) &&
                name.equals(p.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, id, course);
    }
}
