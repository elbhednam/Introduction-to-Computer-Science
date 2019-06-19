public class TestStock {
	public static void main(String[] args) {
		
		Stock oraclestock = new Stock();
		oraclestock.symbol = "ORCL";
		oraclestock.name = "Oracle";
		oraclestock.previousClosingPrice = 34.5;
		oraclestock.currentPrice = 34.35;
		
		System.out.println(oraclestock.symbol + " closed at " + oraclestock.currentPrice + " today, a price change of " + oraclestock.getChangePercent() + "% from yesterday's price of " + oraclestock.previousClosingPrice + ".");
	}
}
