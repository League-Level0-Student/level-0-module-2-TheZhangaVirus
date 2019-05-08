//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		for(int i = 0; i < 10; i++) {
		
		int randomNumber = randomMaker.nextInt((10-1)+1)+1;

		// 1. Use each value of randomNumber to give the user a random compliment.
			
		if(randomNumber == 1) {
				System.out.println("Compliment 1");
			} else if(randomNumber == 2) {
				System.out.println("Compliment 2");
			} else if(randomNumber == 3) {
				System.out.println("Compliment 3");
			} else if(randomNumber == 4) {
				System.out.println("Compliment 4");
			} else if(randomNumber == 5) {
				System.out.println("Compliment 5");
			} else if(randomNumber == 6) {
				System.out.println("Compliment 6");
			} else if(randomNumber == 7) {
				System.out.println("Compliment 7");
			} else if(randomNumber == 8) {
				System.out.println("Compliment 8");
			} else if(randomNumber == 9) {
				System.out.println("Compliment 9");
			} else if(randomNumber == 10) {
				System.out.println("Compliment 10");
			}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
		}
	}
}
