package random;

import java.util.Random;
import javax.swing.JOptionPane;

public class lotteryNumbers {

	public static void main(String[] args) {
		
		Random randomGen1 = new Random();
		
		String number1 = JOptionPane.showInputDialog("pick a number between 1 and 100");
		String number2 = JOptionPane.showInputDialog("pick a number between 1 and 100");
		String number3 = JOptionPane.showInputDialog("pick a number between 1 and 100");
		String number4 = JOptionPane.showInputDialog("pick a number between 1 and 100");
		String number5 = JOptionPane.showInputDialog("pick a number between 1 and 100");
		
		System.out.println("Lottery Numbers:");
		for(int i = 0; i < 5; i++) {
		int number = randomGen1.nextInt(100);
		System.out.println(number);
		}
		System.out.println("Your Numbers:");
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4);
		System.out.println(number5);
		
	}
	
}
