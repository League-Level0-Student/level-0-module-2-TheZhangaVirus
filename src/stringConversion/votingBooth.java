package stringConversion;

import javax.swing.JOptionPane;

public class votingBooth {

	public static void main(String[] args) {
		
		String age = JOptionPane.showInputDialog("what is your age");
		int a = Integer.parseInt(age);
		
		if(a < 18) {
			JOptionPane.showMessageDialog(null, "nobody cares what you think");
		} else {
			String president = JOptionPane.showInputDialog("who do you think the next president should be");
			JOptionPane.showMessageDialog(null, president + "? cool");
		}
		
	}
	
}
