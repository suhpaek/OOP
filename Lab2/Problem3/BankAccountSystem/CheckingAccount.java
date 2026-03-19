package Problem3.BankAccountSystem;

public class CheckingAccount extends Account{
    private int transactionCount;
    private static final int FREE_TRANSACTIONS = 3;

    public CheckingAccount(int accNumber){
        super(accNumber);
        transactionCount = 0;
    }

    @Override
    public boolean deposit(double sum){
        if(super.deposit(sum)){
            transactionCount++;
        }
        return super.deposit(sum);
    }

    @Override
    public boolean withdraw(double sum){
        if(super.withdraw(sum)){
            transactionCount++;
        }
        return super.withdraw(sum);
    }

    public void deductFee(){
        if(transactionCount > FREE_TRANSACTIONS){
            double fee = (transactionCount - FREE_TRANSACTIONS) * 0.02;
            super.withdraw(fee);
        }
        transactionCount = 0;
    }
}
