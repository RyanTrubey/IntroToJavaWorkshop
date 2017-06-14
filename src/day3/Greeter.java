package day3;

import javax.swing.JOptionPane;

public class Greeter {

	public static void main(String[] args) {
		String thing = JOptionPane.showInputDialog("What are you");
		if(thing.equals("idk")){
			JOptionPane.showMessageDialog(null, "die");
		}else{
		JOptionPane.showMessageDialog(null, "Hello, " + thing);
		String answer = JOptionPane.showInputDialog("Can you do flips?");
		if (answer.equals("yes")) {
			JOptionPane.showMessageDialog(null, "do a quad");
		} else {
			JOptionPane.showMessageDialog(null, "get good at flips.");
		}
		}
	}

}
