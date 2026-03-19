package Problem3;
import Problem3.BankAccountSystem.*;
import Problem3.BankClass.*;

public class Test {
    public static void main(String[] args){
        Bank bank = new Bank();

        SavingsAccount s = new SavingsAccount(1, 5);
        CheckingAccount c = new CheckingAccount(2);

        s.deposit(1000);
        c.deposit(200);

        bank.openAccount(s);
        bank.openAccount(c);

        bank.update();

        s.print();
        c.print();
    }
}
