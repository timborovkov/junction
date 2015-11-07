package qproject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;

import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400, 300);
		frame.setTitle("qproject");
		
		// TODO Auto-generated method stub
		System.out.println("Started...");
		
		if(!isInternetReachable()){
			System.out.println("No internet");
		}else{
			//execute app
			//speech.talk("Welcome!");
			frame.setVisible(true);
			Runnable r = new Runnable() {
		         public void run() {
		             while(true){
		            	 try {
							Thread.sleep(5000);
							System.out.println("check");
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		             }
		         }
		     };
		     new Thread(r).start();
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
