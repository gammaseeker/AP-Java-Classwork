package lab5;

public class StockTest {

	public static void main(String[] args) {
		testCase1();
	}
	
	public static void testCase1() {
		Stock s = new Stock("GOOG", "Google Inc.");
		s.setPreviousClosingPrice(100);
		s.setCurrentPrice(90);
		System.out.println(s.changePercent() + "%");
	}
}
