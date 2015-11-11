package qproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class keyboard {
	public static void process(String key){
		System.out.println(key);
		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e1){
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		switch(key){
		case "A":
			robot.keyPress(KeyEvent.VK_A);
			break;
		case "B":
			robot.keyPress(KeyEvent.VK_B);
			break;
		case "C":
			robot.keyPress(KeyEvent.VK_C);
			break;
		case "D":
			robot.keyPress(KeyEvent.VK_D);
			break;
		case "E":
			robot.keyPress(KeyEvent.VK_E);
			break;
		case "F":
				robot.keyPress(KeyEvent.VK_F);
			break;
		case "G":
				robot.keyPress(KeyEvent.VK_G);
			break;
		case "H":
				robot.keyPress(KeyEvent.VK_H);
			break;
		case "I":
				robot.keyPress(KeyEvent.VK_I);
			break;
		case "J":
				robot.keyPress(KeyEvent.VK_J);
			break;
		case "K":
				robot.keyPress(KeyEvent.VK_K);
			break;
		case "L":
				robot.keyPress(KeyEvent.VK_L);
			break;
		case "M":
				robot.keyPress(KeyEvent.VK_M);
			break;
		case "N":
				robot.keyPress(KeyEvent.VK_N);
			break;
		case "O":
				robot.keyPress(KeyEvent.VK_O);
			break;
		case "P":
				robot.keyPress(KeyEvent.VK_P);
			break;
		case "Q":
				robot.keyPress(KeyEvent.VK_Q);
			break;
		case "R":
				robot.keyPress(KeyEvent.VK_R);
			break;
		case "S":
				robot.keyPress(KeyEvent.VK_S);
			break;
		case "T":
				robot.keyPress(KeyEvent.VK_T);
			break;
		case "U":
				robot.keyPress(KeyEvent.VK_U);
			break;
		case "V":
				robot.keyPress(KeyEvent.VK_V);
			break;
		case "W":
				robot.keyPress(KeyEvent.VK_W);
			break;
		case "X":
				robot.keyPress(KeyEvent.VK_X);
			break;
		case "Y":
				robot.keyPress(KeyEvent.VK_Y);
			break;
		case "Z":
				robot.keyPress(KeyEvent.VK_Z);
			break;
		case "ENTER":
				robot.keyPress(KeyEvent.VK_ENTER);
			break;
		case "SHIFT":
				robot.keyPress(KeyEvent.VK_SHIFT);
			break;
		case "BACKSPACE":
				robot.keyPress(KeyEvent.VK_BACK_SPACE);
			break;
		case "TAB":
				robot.keyPress(KeyEvent.VK_TAB);
			break;
		case "SPACE":
			robot.keyPress(KeyEvent.VK_SPACE);	
			break;
		case "EXIT":
			//exit keyboard
			speech.stop_type=true;
			speech.stop=false;
			try {
				speech.recognize();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
	}
}
