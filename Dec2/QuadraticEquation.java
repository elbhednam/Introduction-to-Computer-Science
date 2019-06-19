public class QuadraticEquation {

	private double a;
	private double b;
	private double c;
	
	QuadraticEquation(double a1, double b1, double c1) {
		a = a1;
		b = b1;
		c = c1;
	}
	
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}
	
	public double getDiscriminant(double a, double b, double c) {
		return Math.pow(b, 2) - 4 * a * c;
	}
	
	public double getRoot1() {
			return -b + Math.sqrt(Math.pow(b, 2) - 4 * a * c) / (2 * a);
	}
	
	public double getRoot2() {
			return -b - Math.sqrt(Math.pow(b, 2) - 4 * a * c) / (2 * a);
		}
}
