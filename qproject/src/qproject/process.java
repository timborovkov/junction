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
				System.out.println(http.executeGET("http://arkanor.com/check.php?action=1", ""));
				return true;
			}else if(req.contains("off")){
				//lamp off
				speech.talk("OK, I will turn lamp off");
				System.out.println(http.executeGET("http://arkanor.com/check.php?action=2", ""));
				return true;
			}else if(req.contains("color")){
				//change color
				speech.talk("OK, I will change lamps color for you");
				System.out.println(http.executeGET("http://arkanor.com/check.php?action=5", ""));
				return true;
			}else if(req.contains("bright")){
				if(req.contains("more")){
					//more brightness
					speech.talk("OK,  more brightness");
					System.out.println(http.executeGET("http://arkanor.com/check.php?action=4", ""));
					return true;
				}else if(req.contains("less")){
					//less brightness
					speech.talk("OK, less brightness");
					System.out.println(http.executeGET("http://arkanor.com/check.php?action=3", ""));
					return true;
				}
			}
		}else if(req.contains("google")){
			//search in google
			try {
				Desktop.getDesktop().browse(new URI("http://www.google.com"));
			} catch (IOException | URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			speech.talk("What do you want to search for?");
			return true;
		}else if(req.contains("wiki") || req.contains("wikipedia")){
			//search in wiki
			try {
				Desktop.getDesktop().browse(new URI("http://www.wikipedia.com"));
			} catch (IOException | URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			speech.talk("Are you trying to become smarter?");
			return true;
		}else if(req.contains("go")){
			if(req.contains("back")){
				//go back
			}else if(req.contains("forward")){
				//go forward
			}
		}else if(req.contains("open") || req.contains("go")){
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
			}else if(req.contains("youtube")){
				try {
					Desktop.getDesktop().browse(new URI("http://www.youtube.com"));
				} catch (IOException | URISyntaxException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return true;
			} else if(req.contains("about us")){
			try {
				Desktop.getDesktop().browse(new URI("http://80.69.174.24/"));
			} catch (IOException | URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
			}
		}else if(req.contains("hello")){
			speech.talk("Hi, my dear owner");
			return true;
		}else if(req.contains("play")){
			if(req.contains("music")){
				try {
					Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=DK_0jXPuIr0&list=PLDcnymzs18LVXfO_x0Ei0R24qDbVtyy66"));
				} catch (IOException | URISyntaxException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(req.contains("video")){
				try {
					Desktop.getDesktop().browse(new URI("http://www.youtube.com"));
				} catch (IOException | URISyntaxException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}else if(req.contains("press")){
			if(req.contains("enter")){
				//press enter
			}
		}
		return false;
	}
}
