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
		
		static Thread redT = new Thread(new Runnable() {
			@Override
			public void run() {
				red.moveTo(900, 400);
				red.setPenWidth(5);
				red.penDown();
				red.setSpeed(100);
				red.setPenColor(Color.red);
				for(int i =0;i<360;i++) {
					red.move(3);
					red.turn(1);
				}
			}
		});
		
		static Thread yellowT = new Thread(new Runnable() {
			@Override
			public void run() {
				yellow.moveTo(450, 650);
				yellow.setPenWidth(5);
				yellow.penDown();
				yellow.setSpeed(100);
				yellow.setPenColor(Color.yellow);
				for(int i =0;i<360;i++) {
					yellow.move(3);
					yellow.turn(1);
				}
			}
		});
		
		static Thread greenT = new Thread(new Runnable() {
			@Override
			public void run() {
				green.moveTo(750, 650);
				green.setPenWidth(5);
				green.penDown();
				green.setSpeed(100);
				green.setPenColor(Color.green);
				for(int i =0;i<360;i++) {
					green.move(3);
					green.turn(1);
				}
			}
		});
		
		public static void main(String[] args) {
			blueT.start();
			blackT.start();
			redT.start();
			yellowT.start();
			greenT.start();
		}
}

