package cp120.assignments.assignment005;

import javax.swing.*;

public class Utils {
	
	public int askInt() {
		String m = JOptionPane.showInputDialog("Enter an integer between 10 and 20");

			return Integer.parseInt(m);	
	}
}