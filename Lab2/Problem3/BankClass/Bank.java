package Problem3.BankClass;
import Problem3.BankAccountSystem.*;
import java.util.Vector;

public class Bank {
    private Vector<Account> accounts;

    public Bank(){
        accounts = new Vector<>();
    }

    public boolean openAccount(Account acc){
        if(!(accounts.contains(acc))) {
            accounts.add(acc);
            return true;
        }
        return false;
    }

    public boolean closeAccount(Account acc){
        if(accounts.contains(acc)) {
            accounts.remove(acc);
            return true;
        }
        return false;
    }

    public void update(){
        for(Account acc : accounts){
           if(acc instanceof SavingsAccount){
               SavingsAccount s = (SavingsAccount) acc;
               s.addInterest();
           }
            if(acc instanceof CheckingAccount){
                CheckingAccount c = (CheckingAccount) acc;
                c.deductFee();
            }
        }
    }
}
