import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		Robot gabe=new Robot();
		int i=1;
gabe.penDown();
		
while (i<76){
i=i+1;
gabe.setSpeed(900000000);
	gabe.move(2*i);	
			
	
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
	
			gabe.turn(360/i);
	
gabe.setPenWidth(i+7);
	
			
}

	}
}






