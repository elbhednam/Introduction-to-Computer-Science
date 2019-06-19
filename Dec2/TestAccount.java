public class TestAccount {
	public static void main(String[] args) {
		
		Account newAccount = new Account(1122, 20000.00);
		newAccount.getAnnualInterestRate(4.5);
		newAccount.withdraw(2500);
		newAccount.deposit(3000);
		java.util.Date date = newAccount.getDateCreated();

		System.out.println(newAccount.getBalance() + " " + newAccount.getMontlyInterest() + " " + date.toString() + " ");
	}
}
