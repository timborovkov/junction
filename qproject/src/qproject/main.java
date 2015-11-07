package qproject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Started...");
		
		if(!isInternetReachable()){
			System.out.println("No internet");
		}else{
			//execute app
			speech.talk("Welcome!");
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
