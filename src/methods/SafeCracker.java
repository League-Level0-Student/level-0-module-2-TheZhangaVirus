package methods;

import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class SafeCracker {

	public static void main(String[] args) {
		
		tryCode();
		
		/*
		 * Your mission: use the tryCode method to crack the safe by trying all possible
		 * combinations
		 */
		
		

	}

	static void tryCode() {
		int guess = 9999999;
		System.out.println("trying " + guess);

		int secretCode = 9999999 - wekncrzpasfdkjhcfjse;

		for(int i = 0; i < 100; i++) {
		if (guess == secretCode) {
			JOptionPane.showMessageDialog(null, "Congratulations! You cracked the safe with " + guess);
			playTheSoundOfSuccess();
			System.exit(0);
		} else {
			guess--;
		}
		}
	}

	private static void playTheSoundOfSuccess() {
		try {
			AudioClip sound = JApplet.newAudioClip(SafeCracker.class.getResource("me-gusta.wav"));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	final static int wekncrzpasfdkjhcfjse = new Random().nextInt(100);
}
