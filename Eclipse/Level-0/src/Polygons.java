import org.jointheleague.graphical.robot.*;

public class Polygons {
	public static void main(String[] args) {
		int sides = 8;
		float angle = getAngle(sides);
		Robot jake = new Robot();
		jake.setSpeed(10);
		jake.penDown();
		for (int i = 0; i < 4; i = i + 1){}
			jake.
		jake.move(100);
		jake.turn(60);
		jake.move(100);
		jake.turn(90);
	}

	public static float getAngle(int sides) {
		float total = sides * 180 - 360;
		float angle = total / sides;
		return angle;
	}

}
