package gameZone;

import javax.swing.JOptionPane;

public class RandomGuess3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numberString;
		int count = 0;
		int number;
		int randomNumber = (1 + (int)(Math.random() * 10));
		numberString = JOptionPane.showInputDialog(null, "Think of a number between 1 and 10.");
		number = Integer.parseInt(numberString);
		count ++;
		while (number != randomNumber) {
			if (number > randomNumber) {
				numberString = JOptionPane.showInputDialog(null, "You're guess was too high. Try again.");
			}
			if (number < randomNumber) {
				numberString = JOptionPane.showInputDialog(null, "You're guess was too low. Try again.");
			}
			number = Integer.parseInt(numberString);
			count ++;
		}
		if (number == randomNumber) {
			JOptionPane.showMessageDialog(null, "You're guess was correct. It took " + count + " attempts.");
		}
	}

}
