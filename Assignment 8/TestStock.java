/** 
 *Amanda Bakalarczyk
 *COSC 1046
 *2016-12-03
 *Assignment #8
 *1. Question 9.2
 */
public class TestStock {
	public static void main(String[] args) {
		
		Stock oraclestock = new Stock("ORCL", "Oracle"); // create new stock object with specified symbol and name
		
		oraclestock.previousClosingPrice = 34.5; // previous closing price is 34.5
		oraclestock.currentPrice = 34.35; // current price is 34.35
		
		// display symbol of stock object and current price of stock object
		System.out.println(oraclestock.symbol + " closed at $" + oraclestock.currentPrice + ".");
		// display name of stock object, get and display percent change, display previous closing price 
		System.out.println(oraclestock.name + " had a price change of " + oraclestock.getChangePercent() + "% from a previous closing price of $" + oraclestock.previousClosingPrice + ".");
	}
}
