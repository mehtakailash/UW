package cp120.assignments.assignment005;

import cp120.assignments.assignment005.Utils;
import javax.swing.*;

@SuppressWarnings("serial")
public class OpCanceledException extends Exception{
	
	public static void main(String[] args) {
		Utils utl = new Utils();
		int n = utl.askInt();
		//System.out.println(n);
		if(n>=10 && n<=20) {
			System.out.println(n);
		}
		else JOptionPane.showMessageDialog(null,"\""+ n +"\""+" is invalid");
	}
}