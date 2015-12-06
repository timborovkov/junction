package qproject;

import java.io.IOException;
import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import com.sun.speech.freetts.*;
import java.io.*;

public class speech {
	public static boolean stop = false;
	public static boolean stop_type = false;
	
	public static void recognize() throws IOException{
		Configuration configuration = new Configuration();
		 
		// Set path to acoustic model.
		configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		// Set path to dictionary.
		configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
		// Set language model.
		configuration.setLanguageModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us.lm.bin");
		//Grammar
		configuration.setGrammarPath("resource:/model/grammar/");
		configuration.setUseGrammar(true);
		configuration.setGrammarName("main2");
		
		LiveSpeechRecognizer recognizer = new LiveSpeechRecognizer(configuration);
		recognizer.startRecognition(true);
		System.out.println("Talk...");
		
		while(!stop){
			SpeechResult result = recognizer.getResult();
			String r = result.getHypothesis().toLowerCase();
			System.out.println(r);
			recognizer.stopRecognition();
			if(r.contains("keyboard")){
				stop=true;
				try {
					speech.talk("Say exit if you want to exit keyboard");			
					speech.recognizeKeyboard();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(process.voiceRequest(r)){
				//working request
				System.out.println("Done");
			}
			recognizer.startRecognition(false);
		}
		recognizer.stopRecognition();
	}
	public static void recognizeKeyboard() throws IOException{
		Configuration configuration = new Configuration();
		 
		// Set path to acoustic model.
		configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		// Set path to dictionary.
		configuration.setDictionaryPath("resource:/model/6649.dic");
		// Set language model.
		configuration.setLanguageModelPath("resource:/model/6649.lm");
		// Set grammar
		configuration.setGrammarPath("resource:/model/grammar/");
		configuration.setUseGrammar(true);
		configuration.setGrammarName("keyboard");
		
		LiveSpeechRecognizer recognizer = new LiveSpeechRecognizer(configuration);
		recognizer.startRecognition(true);
		System.out.println("Type with your voice...");
		
		while(!stop_type){
			SpeechResult result = recognizer.getResult();
			String r = result.getHypothesis();
			keyboard.process(r);
		}
		recognizer.stopRecognition();
	}
	private static final String VOICENAME = "kevin16";
	public static void talk(String text){
		Voice voice;
		VoiceManager vm = VoiceManager.getInstance();
		voice = vm.getVoice(VOICENAME);
		
		voice.allocate();
		
		voice.speak(text);
	}
}
/**
 *| C | D | E | F | G | H | I | G | K | L | M | N | O | P | Q | R | S | T | U | V | W | X | Y | Z | ENTER | TAB | BACKSPACE | SHIFT
 */
