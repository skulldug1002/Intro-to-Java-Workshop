import org.jointheleague.graphical.robot.Robot;
public class TriangleShell {
	Robot rakk=new Robot();
	void go() {
		rakk.setSpeed(10);
		int length=50;
		// 7. Do the following (up to step 10) 60 times
			// 9. Change the color of the pen to a random color
			// 8. Increase the length of the side by 10 pixels
			drawtriangle(50);
			rakk.turn(6);
	}
	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int length) {
	}
	public static void main(String[] args) {
		new TriangleShell.go();
	}
}