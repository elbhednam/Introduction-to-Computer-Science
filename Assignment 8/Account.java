/** 
 *Amanda Bakalarczyk
 *COSC 1046
 *2016-12-03
 *Assignment #8
 *2. Question 9.7 
 */

public class Account {
	// data fields
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated = new java.util.Date(); 
	
	// no arg constructor
	Account() {	
	}
	// constructor for account with specified id and balance
	Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
	}
	// getter method for id
	public int getId() {
		return id;
	}
	// setter method for id
	public void setId(int newId) {
		id = newId;
	}
	// getter method for balance
	public double getBalance() {
		return balance;
	}
	//setter method for balance
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	// getter method for rate of annual interest
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	// setter method of rate of annual interest
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate / 100;
	}
	// returns the date
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	// getter method to find the monthly interest rate
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	// getter method to find monthly interest accrued 
	public double getMontlyInterest() {
		// current balance * rate of interest / months in a year
		return balance * (annualInterestRate / 12);
	}
	// method for withdrawing money to create a new balance
	public void withdraw(double withdraw) {
		balance -= withdraw; // subtract withdrawal amount from balance
	}
	// method for depositing money to create a new balance
	public void deposit(double deposit) {
		balance += deposit; //add deposit amount to balance
	}

}
