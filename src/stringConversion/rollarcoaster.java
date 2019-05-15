package stringConversion;

import javax.swing.JOptionPane;

public class rollarcoaster {
	
	public static void main(String[] args) {
		
		String height = JOptionPane.showInputDialog("How tall are you (inches)");
		int h = Integer.parseInt(height);
		
		if(h <= 48) {
			JOptionPane.showMessageDialog(null, "You are not tall enough");
		} else {
			JOptionPane.showMessageDialog(null, "You are tall enough");
		}
		
	}

}
