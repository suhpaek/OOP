package Problem1.c;
import java.util.Objects;

public class TeamLeader extends PickMeTeammates{
    private String teamName;

    public TeamLeader(String name, String id, int course, String teamName){
        super(name,id,course);
        this.teamName = teamName;
    }

    public String getTeamName(){
        return teamName;
    }

    @Override
    public boolean equals(Object o){
        if(!super.equals(o)) return false;

        TeamLeader t = (TeamLeader) o;
        return teamName.equals(t.teamName);
    }

    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(), teamName);
    }
}
