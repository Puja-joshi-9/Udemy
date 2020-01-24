package udemy;

public class MinutesToYearsDaysCalculator {
	
	public static void printYearsAndDays(long minutes) {
		
		if(minutes<0) {
			System.out.println("Invalid Text");
		}
		
		long year = Math.round(minutes/(60*24*365));
		
		long remainingMinutes = minutes - year*60*24*365;
		
		long days = Math.round(remainingMinutes/(60*24));
		
		System.out.println(minutes+" min = "+year+" y And "+days+" d");
	}
	
	public static void main(String[] args) {
		
		printYearsAndDays(525600);
	}

}
