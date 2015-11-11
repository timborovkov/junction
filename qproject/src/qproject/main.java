package qproject;

import java.awt.Color;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;

import javax.swing.JFrame;

public class main {
	static JFrame frame;
	
	public static void main(String[] args) {
		frame = new JFrame();
		frame.setBounds(500, 500, 300, 200);
		frame.setTitle("qproject: Your own way to future");
		frame.setBackground(new Color(99, 207, 167));
		frame.setVisible(false);
		
		if(!isInternetReachable()){
			System.out.println("No internet");
		}else{
			//execute app
			speech.talk("Welcome!");
			
			try {
				speech.recognize();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	//checks for connection to the internet through dummy request
    public static boolean isInternetReachable()
    {
        try {
            //make a URL to a known source
            URL url = new URL("http://www.google.com");

            //open a connection to that source
            HttpURLConnection urlConnect = (HttpURLConnection)url.openConnection();

            //trying to retrieve data from the source. If there
            //is no connection, this line will fail
            Object objData = urlConnect.getContent();

        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
        return true;
    }
  
}
