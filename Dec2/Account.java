
public class Account {
	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated = new java.util.Date(); 
	
	Account() {	
	}
	
	Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int newId) {
		id = newId;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	public void getAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate / 100;
	}
	
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	public double getMontlyInterest() {
		return balance * (annualInterestRate / 12);
	}
	
	public void withdraw(double withdraw) {
		balance -= withdraw;
	}
	
	public void deposit(double deposit) {
		balance += deposit;
	}

}
