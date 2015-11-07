package qproject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;

import com.ibm.watson.developer_cloud.speech_to_text.v1.model.SpeechModel;
import com.ibm.watson.developer_cloud.text_to_speech.v1.TextToSpeech;

public class main {

	public static void main(String[] args) throws URISyntaxException {

		String username = "c6cc17c3-b8c2-49d8-82d3-18e585bf4438";
		String password = "xdfX6djn2ZOJ";
		
		System.out.println("Started...");
		
		TextToSpeech service = new TextToSpeech();
		service.setUsernameAndPassword("c6cc17c3-b8c2-49d8-82d3-18e585bf4438", "xdfX6djn2ZOJ");
		// System.out.println(service.getHttpClient());
		
		
		// Obtaining the token
		String tokenUrl = "https://" + username + ":" + password + "@" + "stream.watsonplatform.net/authorization/api/v1/token";		
		HTTPHandler httpHandler = new HTTPHandler(tokenUrl);
		
		String token = null; // TODO
		
		// Speech to Text service https://stream.watsonplatform.net/authorization/api/v1/token
		
	
		// System.out.println(service.getApiKey());
		
			URI baseUri = new URI("wss://stream.watsonplatform.net/speech-to-text/api/v1/recognize");
			String spaghetti = baseUri.toString() + token + "&model=es-ES_BroadbandModel";
			URI uri = new URI(spaghetti);
			WSSClient wssclient = new WSSClient(uri);
			
			wssclient.connect();
//			SpeechModel model = service.getModel();
//			model.toString();
			
		
		
		
		/*
		if(!isInternetReachable()){
			System.out.println("No internet");
		}else{
			//execute app
			speech.talk("Welcome!");
		}
		*/
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
