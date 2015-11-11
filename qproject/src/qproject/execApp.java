package qproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class execApp {
	public static void run(String app){
		try {
			System.out.println("Opening " + app);
			Runtime runTime = Runtime.getRuntime();
			Process process = runTime.exec(app);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void stop(String app){
		try {
			System.out.println("Closing " + app);
			Runtime runTime = Runtime.getRuntime();
			Process process = runTime.exec(app);
			process.destroy();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void appsRunning(){
		try {
	        String line;
	        Process p = Runtime.getRuntime().exec("ps -e");
	        BufferedReader input =
	                new BufferedReader(new InputStreamReader(p.getInputStream()));
	        while ((line = input.readLine()) != null) {
	            System.out.println(line); //<-- Parse data here.
	        }
	        input.close();
	    } catch (Exception err) {
	        err.printStackTrace();
	    }
	}
}
