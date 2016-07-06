import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {
	private void makePrettyThings() {
		Robot minh=new Robot();
		for();
		minh.penDown();
		minh.setSpeed(10);
		minh.setPenColor(200,100,200);
		int i=26;
		int v=100/3;
			minh.move(200);
			// 10. Make the robot move "i" pixels instead of 200 (don’t need new line of code for this, just change previous one)
	
			// 6. Turn the robot the amount in your angle variable
	
			// 11. Turn the robot one more degree
	}
	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes
	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}
