
public class TestFan {
	public static void main(String[] args) {
		
		Fan fan1 = new Fan();
		fan1.setSpeed(3);
		fan1.setRadius(10);
		fan1.setColour("Yellow");
		fan1.setOn(true);
		
		Fan fan2 = new Fan();
		fan2.setSpeed(2);
		fan2.setRadius(5);
		fan2.getColour();
		fan2.setOn(false);
		
		System.out.println(fan1.toString());
		System.out.println(fan2.toString());
	}
}
