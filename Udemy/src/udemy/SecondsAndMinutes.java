package udemy;

import java.util.Scanner;

public class SecondsAndMinutes {
	public static void main(String[] args) {
		
		System.out.println(getDurationString(65, 45));
		System.out.println(getDurationString(3945L));
	}
	
	
	public static String getDurationString(long minutes, long seconds) {
		
		if(((minutes<0)||(seconds<0)||(seconds>59))) {
		
		return "Invalid Value";
		
		}
		
		long hours =minutes/60;
		long remainingMinutes = minutes%60;
		
		String hourString = hours+"h";
		if(hours<10) {
			hourString = "0"+hourString;
		}
		
		String minutesString =  remainingMinutes +"m";
		if(remainingMinutes<10) {
			minutesString = "0"+minutesString;
		}
		
		String secondString = seconds  +"s";
		if(seconds<10) {
			
			secondString = "0"+secondString;
		}
		
		
		return  hourString+" "+minutesString+" "+secondString+" ";
	}
	
	public static String getDurationString(long seconds) {
		
		if(seconds<0) {
		return "Invalid Value";
		}
		
		long minutes = seconds/60;
		long remainingSeconds = seconds%60;
		
		return getDurationString(minutes,remainingSeconds);
		
	}
	
   	

}
