package day3;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class TortoiseSlave {

	public static void main(String[] args) {
		Tortoise.penDown();
		Tortoise.setSpeed(10);
		String shape = JOptionPane.showInputDialog("What shape am I forced to draw?");
		if (shape.equalsIgnoreCase("square")) {
			for (int i = 0; i < 4; i++) {
				Tortoise.move(100);
				Tortoise.turn(360 / 4);
			}

		} else if (shape.equalsIgnoreCase("triangle")) {
			for (int i = 0; i < 3; i++) {
				Tortoise.move(100);
				Tortoise.turn(360 / 3);
			}

		} else if (shape.equalsIgnoreCase("pentagon")) {
			for (int i = 0; i < 5; i++) {
				Tortoise.move(100);
				Tortoise.turn(360 / 5);
			}
		} else if (shape.equalsIgnoreCase("hexagon")) {
			for (int i = 0; i < 6; i++) {
				Tortoise.move(100);
				Tortoise.turn(360 / 6);
			}
		} else if (shape.equalsIgnoreCase("septagon")) {
			for (int i = 0; i < 7; i++) {
				Tortoise.move(100);
				Tortoise.turn(360 / 7);
			}
		} else if (shape.equalsIgnoreCase("octagon")) {
			for (int i = 0; i < 8; i++) {
				Tortoise.move(100);
				Tortoise.turn(360 / 8);
			}
		} else if (shape.equalsIgnoreCase("nonogon")) {
			for (int i = 0; i < 9; i++) {
				Tortoise.move(100);
				Tortoise.turn(360 / 9);
			}
		} else if (shape.equalsIgnoreCase("decagon")) {
			for (int i = 0; i < 10; i++){
				Tortoise.move(100);
				Tortoise.turn(360/10);
			}
		}
	}
}
