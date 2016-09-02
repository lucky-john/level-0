import java.awt.Color;
import java.awt.KeyboardFocusManager;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class FirstLetterOfMyName{
	public static void main(String[] args) {
		new FirstLetterOfMyName().controlTheTortoise();
	}

	private void controlTheTortoise() {
		Tortoise.turn(400000000);
		Tortoise.setPenColor(Colors.getRandomColor());
		Tortoise.penDown();
		Tortoise.setSpeed(5);
		Tortoise.move(200);
		Tortoise.turn(-90);
		Tortoise.setPenColor(Colors.getRandomColor());
		Tortoise.move(70);
		Tortoise.turn(180);
		Tortoise.setPenColor(Colors.getRandomColor());
		Tortoise.move(140);
		Tortoise.turn(-180);
		Tortoise.setPenColor(Colors.getRandomColor());
		Tortoise.move(70);
		Tortoise.turn(-90);
		Tortoise.setPenColor(Colors.getRandomColor());
		Tortoise.move(200);
		Tortoise.turn(-270);
		Tortoise.setPenColor(Colors.getRandomColor());
		Tortoise.move(70);
		Tortoise.turn(90);
		Tortoise.setPenColor(Colors.getRandomColor());
		Tortoise.move(70);
		Tortoise.turn(-180);
		Tortoise.setPenColor(Colors.getRandomColor());
		Tortoise.move(70);
		Tortoise.turn(270);Tortoise.setPenColor(Colors.getRandomColor());
		Tortoise.penUp();
		Tortoise.move(170);
		Tortoise.turn(-90);
		Tortoise.setPenColor(Colors.getRandomColor());
		Tortoise.penDown();
		Tortoise.move(200);
		Tortoise.turn(90);
		Tortoise.setPenColor(Colors.getRandomColor());
		Tortoise.move(100);
		Tortoise.turn(-270);
		Tortoise.setPenColor(Colors.getRandomColor());
		Tortoise.move(80);
		Tortoise.turn(90);
		Tortoise.setPenColor(Colors.getRandomColor());
		Tortoise.move(100);
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
