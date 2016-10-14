import org.jointheleague.graphical.robot.Robot;

public class house {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i = i + 1) {
		}
	 Robot joey = new Robot();

				
				joey.penDown();
				float angle=getAngle(4);for(
				int i = 0;i<4;i=i+1)

				{
					joey.move(100);
					joey.turn(180 - 90);
				}

	}

	public static float getAngle(int sides) {
		float total = sides * 180 - 360;
		float angle = total / sides;
		return angle;
	}

	public static void drawshape(int sides)

	{

		{