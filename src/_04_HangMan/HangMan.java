package _04_HangMan;

import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan{
	JFrame frame;
	JLabel label; 
	JPanel panel;
	public static void main(String[] args) {
		int maxNum = Utilities.getTotalWordsInFile("dictionary.txt");
		String number = JOptionPane.showInputDialog("Enter a number from 0 to " + maxNum);
		int num = Integer.parseInt(number);
		Stack<String> strings = new Stack<String>();
		for(int i = 0; i < num; i++) {
			String random = Utilities.readRandomLineFromFile("dictionary.txt");
			if(strings.contains(random)) {
				i--;
			}
			else {
				strings.push(random);
			}
		}
	}
}
