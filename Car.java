
public class Car {
	private String color;
	private String accelerate;
	private String type;
	private int speed;
	public String toString(){
		return "The " + color + " "+ type + " going "+ speed + "mph" + " " + accelerate;
	}
	// Getter
	public String getColor() {
		return color;
	}
	// Setter
	public void setColor(String c) {
		this.color = c;
	}

	//Getter
	public String getAccelerate(){
		return accelerate;	 
	}//Setter
	public void setAccelerate(String ac){
		this.accelerate = ac;

	}
	//Getter
	public String getType(){
		return type;
	}
	//Setter
	public void setType (String model){
		this.type = model;

	}public int getSpeed() {
		return speed;
	}
	public int setSpeed(int spd) {
		return this.speed = spd;
	}

}

