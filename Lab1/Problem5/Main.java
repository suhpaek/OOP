package Problem5;

public class Main {

    public static void main(String[] args) {

        DragonLaunch dl1 = new DragonLaunch();
        dl1.kidnap(new Person("A", Gender.BOY));
        dl1.kidnap(new Person("B", Gender.BOY));
        dl1.kidnap(new Person("C", Gender.GIRL));
        dl1.kidnap(new Person("D", Gender.GIRL));

        System.out.println(dl1);
        System.out.println("Will dragon eat? " + dl1.willDragonEatOrNot());

        DragonLaunch dl2 = new DragonLaunch();
        dl2.kidnap(new Person("E", Gender.GIRL));
        dl2.kidnap(new Person("F", Gender.BOY));
        dl2.kidnap(new Person("G", Gender.GIRL));
        dl2.kidnap(new Person("H", Gender.BOY));

        System.out.println(dl2);
        System.out.println("Will dragon eat? " + dl2.willDragonEatOrNot());
    }
}
