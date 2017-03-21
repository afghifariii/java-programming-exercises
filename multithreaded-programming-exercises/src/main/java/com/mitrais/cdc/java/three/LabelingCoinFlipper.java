package com.mitrais.cdc.java.three;
import java.util.Random;

import javax.swing.*;

public class LabelingCoinFlipper implements Runnable {
	private JLabel label;

	public LabelingCoinFlipper(JLabel label) {
		label.setText(String.format("Heads: %3d", 0));
		this.label = label;
	}

	@Override
	public void run() {
		pause(200);

		//TODO: create 'for' loop 1000 times
		//and also place counter in it.
		//Print something like this:
		//"Heads: 1!!"
		//or like this"
		//"Heads: 3"  
		//do not forget to add "pause(5);" after change the label text
		//so you could see the entire process
		int headCounter = 0;
		for (int i = 0; i < 1000; i++) {
			String [] coin = {"HEADS", "TAILS"};
			Random random = new Random();
			int select = random.nextInt(coin.length);
			switch (select) {
			case 0:
				headCounter++;
				this.label.setText(String.format("%s: %s%n",coin[select], headCounter));
				break;
			default:
				break;
			}
			pause(5);
		}

	}

	private static void pause(int millis) {
		try {
			Thread.sleep(millis);
		} catch(InterruptedException ie) {}
	}
}