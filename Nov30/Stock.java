
public class Stock {
	
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	public Stock() {
	}
	
	Stock(String newSymbol, String newName) {
		symbol = newSymbol;
		name = newName;
	}
	
	double getChangePercent() {
		return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
	}

}
