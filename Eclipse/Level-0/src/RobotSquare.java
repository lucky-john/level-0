import org.jointheleague.graphical.robot.Robot;

public class RobotSquare {
	public static void main(String[] args) {
		int time = 26;
		Robot idk = new Robot();
		idk.penDown();
		idk.setSpeed(10);
		idk.setPenColor(0, 221, 255);
		for (int i = 0; i < 4; i = i + 1)
			idk.move(70);
		idk.turn(90);
		idk.move(300);
		idk.turn(90);
		idk.move(280);
		idk.turn(90);
		idk.move(600);
		idk.turn(90);
		idk.move(280);
		idk.turn(90);
		idk.move(600);
		
		
	}

}
