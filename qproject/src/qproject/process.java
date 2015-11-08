package qproject;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class process {
	public static boolean voiceRequest(String req){
		//choose object or action
		if(req.contains("lamp")){
			//choose action
			
			if(req.contains("on")){
				//lamp on
				speech.talk("OK, I will turn lamp on");
				
				return true;
			}else if(req.contains("off")){
				//lamp off
				speech.talk("OK, I will turn lamp off");
				
				return true;
			}else if(req.contains("color")){
				//change color
				speech.talk("OK, I will change lamps color for you");
				
				return true;
			}else if(req.contains("bright")){
				if(req.contains("more")){
					//more brightness
					speech.talk("OK,  more brightness");
					
					return true;
				}else if(req.contains("less")){
					//less brightness
					speech.talk("OK, less brightness");
					
					return true;
				}
			}
		}else if(req.contains("google")){
			//search in google
			speech.talk("What do you want to search for?");
			main.showFrame(true);
			return true;
		}else if(req.contains("wiki") || req.contains("wikipedia")){
			//search in wiki
			speech.talk("What do you want to search for?");
			main.showFrame(true);
			return true;
		}else if(req.contains("go")){
			if(req.contains("back")){
				//go back
			}else if(req.contains("forward")){
				//go forward
			}
		}else if(req.contains("open")){
			if(req.contains("explorer")){
				try {
					Desktop.getDesktop().open(new File("/"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return true;
			}else if(req.contains("browser")){
				try {
					Desktop.getDesktop().browse(new URI("http://www.google.com"));
				} catch (IOException | URISyntaxException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return true;
			}
		}else if(req.contains("hello")){
			speech.talk("Hi, bro");
			return true;
		}
		return false;
	}
}
