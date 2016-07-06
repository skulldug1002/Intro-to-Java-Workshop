import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class HelloWorld {
	public static void main(String[] x) {
	Robot budoof=new Robot();
	int i=1;
	budoof.setSpeed(20);
	budoof.penDown();
	budoof.turn(90);
	budoof.move(150);
	budoof.turn(90);
	while(i<5){
		budoof.setSpeed(12);
		budoof.penDown();
		budoof.turn(90);
		budoof.move(150);
		  i=i+1;
	}
	}
	
}
