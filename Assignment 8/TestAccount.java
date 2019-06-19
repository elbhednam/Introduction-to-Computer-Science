/** 
 *Amanda Bakalarczyk
 *COSC 1046
 *2016-12-03
 *Assignment #8
 *2. Question 9.7 
 */

public class TestAccount {
	public static void main(String[] args) {
		
		Account newAccount = new Account(1122, 20000.00); // create account with id: 1122 and a balance of $20000.00
		newAccount.setAnnualInterestRate(4.5); // set interest rate to 4.5%
		newAccount.withdraw(2500); // withdraw $2500.00
		newAccount.deposit(3000); // deposit $3000.00
		java.util.Date date = newAccount.getDateCreated(); // get the date

		System.out.println("Current Balance: $" + newAccount.getBalance()); // display the new balance
		System.out.println("Monthly Interest: $" + newAccount.getMontlyInterest()); // display the monthly interest accrued
		System.out.println("Date Created: " + date.toString()); // display the date
	}
}
