package day3;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "July 8th";
		String dadsBirthday = "August 9th";
		String myBirthday = "September 25th";

		// 2. Find out which birthday the user wants and and store their
		// response in a variable
		String birthday = JOptionPane.showInputDialog("Which birthday do you want to see?");
		// 3. Print out what the user typed
		// 4. if user asked for "mom"
		if (birthday.equalsIgnoreCase("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		} else if (birthday.equalsIgnoreCase("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		} else if (birthday.equalsIgnoreCase("mine")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		} else if (birthday.equalsIgnoreCase("Ryan")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		} else if (birthday.equalsIgnoreCase("You")) {
			JOptionPane.showMessageDialog(null, "NO, I am anonymous");
		} else {
			JOptionPane.showMessageDialog(null, "I don't know that birthday");
		}
		// 6. if user asked for your name
		// print myBirthday
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"

	}
}
