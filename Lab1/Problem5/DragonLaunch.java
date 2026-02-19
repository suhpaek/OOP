package Problem5;

import java.util.Vector;

public class DragonLaunch {

    private Vector<Person> kidnapped = new Vector<>();

    public void kidnap(Person p) {
        kidnapped.add(p);
    }

    public boolean willDragonEatOrNot() {
        int unmatchedBoys = 0;
        int remainingGirls = 0;

        for (int i = 0; i < kidnapped.size(); i++) {
            Gender g = kidnapped.get(i).getGender();

            if (g == Gender.BOY) {
                unmatchedBoys++;
            } else {
                if (unmatchedBoys > 0) {
                    unmatchedBoys--;
                } else {
                    remainingGirls++;
                }
            }
        }

        return (unmatchedBoys + remainingGirls) > 0;
    }

    @Override
    public String toString() {
        return kidnapped.toString();
    }
}
