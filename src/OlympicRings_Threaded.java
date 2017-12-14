import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
public static void main(String[] args) {
	Robot r1 = new Robot(800, 700);
	Robot r2 = new Robot(900, 700);
	Robot r3 = new Robot(1000, 700);
	Robot r4 = new Robot(850, 800);
	Robot r5 = new Robot(950, 800);
	
	r1.setSpeed(10);
	r2.setSpeed(10);
	r3.setSpeed(10);
	r4.setSpeed(10);
	r5.setSpeed(10);
	
	r1.setPenColor(Color.BLUE);
	r2.setPenColor(Color.BLACK);
	r3.setPenColor(Color.RED);
	r4.setPenColor(Color.YELLOW);
	r5.setPenColor(Color.GREEN);
	
	r1.setPenWidth(8);
	r2.setPenWidth(8);
	r3.setPenWidth(8);
	r4.setPenWidth(8);
	r5.setPenWidth(8);
	
	r1.penDown();
	r2.penDown();
	r3.penDown();
	r4.penDown();
	r5.penDown();
	
	r1.setAngle(60);
	r2.setAngle(60);
	r3.setAngle(60);
	r4.setAngle(60);
	r5.setAngle(60);
	
	new Thread(()->{
		for (int i = 0; i < 360; i++) {
			r1.setAngle(i);
			r1.move(400);
		}
		
	
	}).start();
	new Thread(()->r2.move(400)).start();
	new Thread(()->r3.move(400)).start();
	new Thread(()->r4.move(400)).start();
	new Thread(()->r5.move(400)).start();

}
}

