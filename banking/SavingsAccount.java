package banking;

	class SavingsAccount extends Account {
	    @Override
	    public void deposit(double amount) {
	        balance += amount;
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	        } else {
	            System.out.println("Insufficient balance");
	        }
	    }

	    @Override
	    public double getBalance() {
	        return balance;
	    }

}
