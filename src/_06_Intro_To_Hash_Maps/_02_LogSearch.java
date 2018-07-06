package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener{
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	HashMap<Integer, String> search = new HashMap<Integer, String>();
	JFrame frame;
	JPanel panel;
	JButton button1, button2, button3, button4; 
	public static void main(String[] args) {
		_02_LogSearch logs = new _02_LogSearch();
		logs.createUI();
	}
	
	public void createUI() {
		frame = new JFrame();
		panel = new JPanel();
		button1 = new JButton("Add Entry");
		button2 = new JButton("Search by ID");
		button3 = new JButton("View List");
		button4 = new JButton("Remove Entry");
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.setVisible(true);
		frame.pack();
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(button1)) {
			String IDnum = JOptionPane.showInputDialog("Enter an ID number");
			int ID = Integer.parseInt(IDnum);
			String name = JOptionPane.showInputDialog("Enter a name");
			search.put(ID, name);
		}
		else if(e.getSource().equals(button2)) {
			String IDnum = JOptionPane.showInputDialog("Enter an ID number");
			int ID = Integer.parseInt(IDnum);
			if(search.containsKey(ID)){
				JOptionPane.showMessageDialog(null, "The corresponding name is " + search.get(ID));
			}
			else {
				JOptionPane.showMessageDialog(null, "That entry does not exist");
			}
		}
		else if(e.getSource().equals(button3)) {
			String fullList = "";
			for(Integer i: search.keySet()) {
				fullList += "ID: " + i + " Name: " + search.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, fullList);
		}
		else if(e.getSource().equals(button4)) {
			String IDnum = JOptionPane.showInputDialog("Enter an ID");
			int ID = Integer.parseInt(IDnum);
			if(search.containsKey(ID)) {
				search.remove(ID);
				JOptionPane.showMessageDialog(null, "Successfully removed ID " + ID);
			}
			else {
				JOptionPane.showMessageDialog(null, "That entry does not exist");
			}
		}
	}
}
