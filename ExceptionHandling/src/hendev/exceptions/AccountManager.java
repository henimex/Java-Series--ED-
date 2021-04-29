package hendev.exceptions;

public class AccountManager {
    private double balance;

    public void deposit(int amount) {
        System.out.println("--------------- Deposit Operation -----");
        balance = getBalance() + amount;
        System.out.println("Account Information : "+amount + " Deposit Completed");
        System.out.println("Account Balance \t: " + balance);
    }

    public void withdraw(double amount) throws Exception {
        if (balance >= amount){
            System.out.println("--------------- Withdraw Operation ||");
            balance = getBalance() - amount;
            System.out.println("Account Information : "+ amount + " Withdraw Completed");
            System.out.println("Account Balance \t: " + balance);
        } else{
            System.out.println("--------------- Withdraw Operation -----");
            System.out.println("Balance \t\t\t: " + balance);
            System.out.println("Withdraw Request \t: " + amount);
            System.out.println("Your Balance is not enough for this request Would you like to use your Credit Account for the requested amount");
            throw new Exception ("Insufficient Founds");
        }

    }

    public double getBalance() {
        return balance;
    }
}
