package Problem1;
import java.util.*;

public class SafeDivider {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                int x1 = Integer.parseInt(sc.nextLine());
                int x2 = Integer.parseInt(sc.nextLine());
                int res = x1 / x2;
                System.out.println("Result: " + res);
                break;
            } catch (ArithmeticException | NumberFormatException e) {
                e.printStackTrace();
            }
        }
        sc.close();
    }
}
