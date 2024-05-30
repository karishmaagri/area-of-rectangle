package banking;

public abstract class Account {
	    protected double balance;

	    public abstract void deposit(double amount);
	    public abstract void withdraw(double amount);
	    public abstract double getBalance();

	    // Common functionality
	    public void displayBalance() {
	        System.out.println("Balance: " + balance);
	    }


}
