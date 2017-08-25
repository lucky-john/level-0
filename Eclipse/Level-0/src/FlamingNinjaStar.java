import org.jointheleague.graphical.robot.Robot;

public class FlamingNinjaStar {
	public static void main(String[] args) {

		int baseSize = 300; // the size of the black part of the star
		int flameSize = 200; // the length of the flaming arms

		// 1. Make a new robot, and set it's pen down.
		Robot star = new Robot("mini");
		star.penDown();
		// *14. Use the methods setX and setY to move the ninja star into the
		// center of the screen
		star.setX(450);
		star.setY(300);
		// *15. Make some adjustments to see what other kinds of shapes you can
		// make.

		// 12. Set the robot speed to 10
		star.setSpeed(10);
		// 13. Make all the code below repeat 25 times
		 for (int i = 0; i < 25; i++) {
		// 2. Turn the robot 1/8 of a circle
		int angle = 360 / 8;
		// 3. Move the robot 64 pixels
		star.move(64);

		// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will turn
		// the robot counter-clockwise.)
		star.turn(-40);
		// 5. Move the robot the distance in the variable flameSize
		star.setPenColor(255,255,85);
		star.move(flameSize);
		// 6. Turn the robot 170 degrees
		star.turn(170);
		// 7. Move the robot the distance in the variable flameSize (again)
		star.move(flameSize);
		star.setPenColor(0,0,0);
		// 8. Turn the robot 64 degrees to the right
		star.turn(64);
		// 9. Move the robot the distance in the variable baseSize
		star.move(baseSize);
		// 10. Check that your shape is the same as Figure 1. This is one arm of
		// the ninja star.
		// 11. Color your ninja star like Figure 2.
		 }
	}

}
