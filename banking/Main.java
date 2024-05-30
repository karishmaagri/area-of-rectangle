package banking;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Bank bank = new Bank();
	        System.out.println("Total accounts: " + Bank.getTotalAccounts());

	        SavingsAccount savingsAccount = new SavingsAccount();
	        savingsAccount.deposit(1000);
	        savingsAccount.displayBalance();

	        Transaction transaction = new Transaction();
	        transaction.performTransaction(savingsAccount, 200);
	        savingsAccount.displayBalance();
	    }
	}

	
