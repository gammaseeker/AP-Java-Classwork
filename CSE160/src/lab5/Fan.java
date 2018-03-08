package lab5;

public class Fan {
	private static final int SLOW = 1;
	private static final int MEDIUM = 2;
	private static final int FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";
	
	public Fan() {
		
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public boolean getStatus() {
			return this.on;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setStatus(boolean status) {
		this.on = status;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String toString() {
		if(on)
			return ("Fan Speed: " + this.getSpeed() +  "\n Fan Color: " + this.getColor() + "\n Fan Radius: " + this.getRadius());
		return ("Fan Color: " + this.getColor() + "\n Fan Radius: " + this.getRadius() + "\n fan is off");
	}
}
