package Problem1.c;
import java.util.HashSet;

public class Test {

    public static void main(String[] args){

        HashSet<PickMeTeammates> set = new HashSet<>();

        set.add(new PickMeTeammates("Amina","1",2));
        set.add(new PickMeTeammates("Nursultan","2",2));
        set.add(new PickMeTeammates("Nurkhan","3",1));
        set.add(new PickMeTeammates("Nurkhan","3",1));

        System.out.println(set.size());
    }
}
