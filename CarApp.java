import javax.management.remote.SubjectDelegationPermission;

public class CarApp {

	public static void main(String[] args) {
		Car uno;
		uno = new Car();
		uno.setColor("blue");
		uno.setAccelerate("is accelerating");
		uno.setType("Jetta");
		uno.setSpeed(90);
		System.out.println(uno);
	}

}
