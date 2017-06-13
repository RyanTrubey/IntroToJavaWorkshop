package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		int sides = 360;
		int sidelength = 1;
		Robot idk = new Robot();
		idk.setSpeed(10);
		idk.penDown();
		
		for(int k = 0; k < 6; k++){
		for(int i = 0; i < sides; i++){
		idk.move(sidelength);
		idk.turn(360/sides);
		}
		idk.penUp();
		idk.turn(60);
		idk.move(10);
		idk.penDown();
		}
		
	}
}
