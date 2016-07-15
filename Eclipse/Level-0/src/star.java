import org.jointheleague.graphical.robot.Robot;

public class star {
	public static void main(String[] args) {
		Robot idk = new Robot();
		idk.penDown();
		idk.setSpeed(10);
		idk.setPenColor(0, 221, 255);
		for (int i = 0; i < 5; i = i + 1)
			idk.move(70);
		    idk.turn(45);

	}
}
