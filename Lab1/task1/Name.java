package task1;
import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner bebe = new Scanner(System.in);
        System.out.print("Введите имя:");

        String s = bebe.nextLine();
        String m = "-";
        String minus = m.repeat(s.length());
        System.out.println("+" + minus + "+");
        System.out.println("|" + s + "|");
        System.out.println("+" + minus + "+");
    }
}
