public class Hex {
	public static void main(String[] args) {
		
		Hexagon hex1 = new Hexagon(5.5);
		
		System.out.println("The area of a hexagon with sides of length " + hex1.side + " is " + hex1.getArea());
	
	}//
}//

class Hexagon {
	
	double side;
	
	Hexagon() {
		side = 1;
	}
	
	Hexagon(double newSide) {
		side = newSide;
	}
	
	double getArea() {
		return 6 * Math.pow(side, 2) / (4 * Math.tan(Math.PI / 6));
	}
	
	double getPerimeter() {
		return 6 * side;
	}
	
	void setSide(double newSide) {
		side = newSide;
	}
}