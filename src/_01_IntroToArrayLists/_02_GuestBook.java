package _01_IntroToArrayLists;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame;
	JPanel panel;
	JButton button1, button2; 
	ArrayList<String> names;
	public static void main(String[] args) {
		_02_GuestBook book = new _02_GuestBook();
		book.createUI();
	}
	
	public void createUI() {
		frame = new JFrame();
		panel = new JPanel();
		button1 = new JButton("Add Name");
		button2 = new JButton("View Names");
		names = new ArrayList<String>();
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		frame.setVisible(true);
		frame.pack();
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(button1)) {
			String name = JOptionPane.showInputDialog("Enter a name");
			names.add(name);
		}
		else if(e.getSource().equals(button2)) {
			for(int i = 0; i < names.size(); i++) {
				JOptionPane.showMessageDialog(null, "Guest #" + (i+1) + ": " + names.get(i));
			}
		}
	}
	
}
