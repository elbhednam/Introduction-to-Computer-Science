
public class Fan {

	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;
	
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String colour = "Blue";
	
	Fan() {
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}
	
	public boolean isOn() {
		return on;
	}
	
	public void setOn(boolean onoff) {
		on = onoff;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	
	public String getColour() {
		return colour;
	}
	
	public void setColour(String newColour) {
		colour = newColour;
	}
	
	public String toString() {
		if (on == true) {
			return "Speed: " + speed + ", Colour: " + colour + ", Radius: " + radius; 
		}
		else
			return "Fan is not on. Colour: " + colour + ", Radius: " + radius;
	}
}
