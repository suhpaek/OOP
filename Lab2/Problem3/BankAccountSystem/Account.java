package Problem3.BankAccountSystem;

public class Account {
    private double balance;
    private int accNumber;

    public Account(int accNumber){
        balance = 0.0;
        this.accNumber = accNumber;
    }

    public boolean deposit(double sum){
        if(sum > 0){
            balance += sum;
            return true;
        }
        return false;
    }

    public boolean withdraw(double sum){
        if(balance > 0 && sum > 0){
            balance -= sum;
            return true;
        }
        return false;
    }

    public double getBalance(){
        return balance;
    }

    public int getAccNumber(){
        return accNumber;
    }

    public boolean transfer(double amount, Account other){
        if(withdraw(amount)){
            other.deposit(amount);
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return "Balance: " + getBalance() +
                ", Account number: " + getAccNumber();
    }

    public final void print(){
        System.out.println(toString());
    }
}
