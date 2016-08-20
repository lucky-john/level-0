import org.jointheleague.graphical.robot.Robot;

public class robotstar {
public static void main(String[] args) {

Robot dude = new Robot();
dude.penDown();
dude.setSpeed(10);
dude.setRandomPenColor();
for (int i = 0; i < 5; i = i + 1){
dude.turn(-65);
dude.move(400);
dude.turn(120);
dude.move(400);
dude.turn(145);
dude.move(550);
dude.turn(155);
dude.move(590);	
dude.turn(155);
dude.move(542);	
dude.hide();
}	
	
	
}
}
