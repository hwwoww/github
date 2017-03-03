package model;

import javax.swing.JOptionPane;

public class AlertMessage {

		Message msg; 
		
		public void show(){
			String m = msg.createGreet();
			JOptionPane.showMessageDialog(null, m);
		}
}
