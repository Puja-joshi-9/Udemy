package udemy;

import java.util.Scanner;

public class DecimalComparator {
	
	public static boolean areEqualByThreeDecimalPlaces(double a,double b) {
		
		a = (int)(a*1000);
		b = (int)(b*1000);
		
		if(a==b) {
			System.out.println(true); 
		}else
			System.out.println(false);
		
		
		return false;
	}

	public static void main(String[] args) {
		
		
		System.out.println("Enter the numbers");
		Scanner sc = new Scanner(System.in);
		double a =sc.nextDouble();
		double b =sc.nextDouble();
		
		
		areEqualByThreeDecimalPlaces(a,b);
	}
}
