package banking;

	final class Transaction {
	    private static final double transactionFee = 0.5; // Fixed transaction fee

	    public final void performTransaction(Account account, double amount) {
	        double totalAmount = amount + transactionFee;
	        account.withdraw(totalAmount);
	    }

}
