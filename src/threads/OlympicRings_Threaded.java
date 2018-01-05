package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
		static Robot blue = new Robot();
		static Robot yellow = new Robot();
		static Robot red = new Robot();
		static Robot black = new Robot();
		static Robot green = new Robot();
		
		static Thread blueT = new Thread(new Runnable() {
			@Override
			public void run() {
				blue.moveTo(300, 400);
				blue.penDown();
				blue.setSpeed(100);
				blue.setPenWidth(5);
				blue.setPenColor(Color.blue);
				for(int i=0;i<360;i++) {
					blue.move(3);
					blue.turn(1);
				}
			}
		});
		
		static Thread blackT = new Thread(new Runnable() {
			@Override
			public void run() {
				black.moveTo(600, 400);
				black.setPenWidth(5);
				black.penDown();
				black.setSpeed(100);
				black.setPenColor(Color.black);
				for(int i =0;i<360;i++) {
					black.move(3);
					black.turn(1);
				}
			}
		});
		
		public static void main(String[] args) {
			blueT.start();
			blackT.start();
		}
}

