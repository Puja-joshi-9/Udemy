package udemy;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year");
		isLeapYear(sc.nextInt());
	}
	
	public static boolean isLeapYear(int year) {
		if(year>=1 && year<=9999) {
			if(year%4==0) {
				
				if(year%100==0) {
					
					if(year%400==0){
						
						System.out.println(year+"is leap year");
					}else
						System.out.println(year+"is not leap year");
				}else
					System.out.println(year+"is leap year");	
					
			}else
				System.out.println(year+"is not leap year");

		}else
			System.out.println("Invalid range.");
		
		return false;

		
	}

}
