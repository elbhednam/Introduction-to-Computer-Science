/** 
 *Amanda Bakalarczyk
 *COSC 1046
 *2016-12-03
 *Assignment #8
 *1. Question 9.2
 */

public class Stock {
	// data fields
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	// constructor for stock object with specified symbol and name
	public Stock(String newSymbol, String newName) {
	symbol = newSymbol;
	name = newName;
	}
	
	// getter method for the percent change
	double getChangePercent() {
		return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
	}

}
