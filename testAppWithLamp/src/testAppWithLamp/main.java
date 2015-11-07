package testAppWithLamp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(400, 250);
		frame.setTitle("Demo App");
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(1);
		
		JButton btn1 = new JButton();
		btn1.setBounds(0, 0, 131, 64);
		btn1.setText("Lamp on");
		btn1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// turn lamp on
				String result = http.executeGET("http://junction.esy.es/check.php", "action=1");
				System.out.println(result);
			}
		});
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton();
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//turn lamp off
				String result = http.executeGET("http://junction.esy.es/check.php", "action=2");
				System.out.println(result);
			}
		});
		btn2.setText("Lamp off");
		btn2.setBounds(269, 0, 131, 64);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton();
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//turn lamp bright
				String result = http.executeGET("http://junction.esy.es/check.php", "action=4");
				System.out.println(result);
			}
		});
		btn3.setText("brightnes high");
		btn3.setBounds(0, 150, 131, 64);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton();
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//turn lamp low bright
				String result = http.executeGET("http://junction.esy.es/check.php", "action=3");
				System.out.println(result);
			}
		});
		btn4.setText("brightnes low");
		btn4.setBounds(269, 150, 131, 64);
		frame.getContentPane().add(btn4);
		
		JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//change color
				String result = http.executeGET("http://junction.esy.es/check.php", "action=5");
				System.out.println(result);
			}
		});
		button.setText("change color");
		button.setBounds(137, 84, 131, 64);
		frame.getContentPane().add(button);
		
		frame.setVisible(true);
	}
}
