
public class TestRectangle {
	public static void main(String[] args) {
		
		Rectangle rectangle1 = new Rectangle();
		rectangle1.height = 40;
		rectangle1.width = 4;
		
		Rectangle rectangle2 = new Rectangle();
		rectangle2.height = 35.9;
		rectangle2.width = 3.5;
		
		System.out.println("Rectangle 1 has a height of " + rectangle1.height + ", a width of " + rectangle1.width + ", an area of " + rectangle1.getArea() + ", and a perimeter of " + rectangle1.getPerimeter() + ".");
		System.out.println();
		System.out.println("Rectangle 2 has a height of " + rectangle2.height + ", a width of " + rectangle2.width + ", an area of " + rectangle2.getArea() + ", and a perimeter of " + rectangle2.getPerimeter() + ".");
	}
}
