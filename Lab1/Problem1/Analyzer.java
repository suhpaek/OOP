package Problem1;
import java.util.Scanner;

public class Analyzer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Data data = new Data();

        while(true) {
            System.out.print("Enter a number('Q' to quit): ");
            String value = sc.nextLine();

            if(value.equalsIgnoreCase("Q")) {
                break;
            }

            try{
                double x = Double.parseDouble(value);
                data.add(x);
            } catch(NumberFormatException e) {
                System.out.println("Enter a number or 'Q'");
            }
        }

        System.out.println("Average: " + data.getAverage());
        System.out.println("Maximum: " + data.getMaximum());
        sc.close();
    }
}
