package qproject;

import java.io.IOException;
import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;

public class speech {
	public static boolean stop = false;
	public static void recognize() throws IOException{
		Configuration configuration = new Configuration();
		 
		// Set path to acoustic model.
		configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		// Set path to dictionary.
		configuration.setDictionaryPath("resource:/model/8050.dic");
		// Set language model.
		configuration.setLanguageModelPath("resource:/model/8050.lm");
		
		LiveSpeechRecognizer recognizer = new LiveSpeechRecognizer(configuration);
		recognizer.startRecognition(true);
		System.out.println("Talk...");
		
		while(!stop){
			SpeechResult result = recognizer.getResult();
			String r = result.getHypothesis().toLowerCase();
			System.out.println(r);
			recognizer.stopRecognition();
			if(process.voiceRequest(r)){
				//working request
				System.out.println("Done");
			}
			recognizer.startRecognition(false);
		}
		recognizer.stopRecognition();
	}
	public static void talk(String text){
	       
	 }
}
