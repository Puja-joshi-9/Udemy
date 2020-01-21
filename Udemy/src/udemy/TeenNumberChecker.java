package udemy;

import java.util.Scanner;

public class TeenNumberChecker {
	
	public static boolean hasTeen(int a , int b , int c) {
		
		if((a>=13&&a<=19)||(b>=13&&b<=19)||(c>=13&&c<=19)) {
			
			System.out.println(true);
		}else {
			
			System.out.println(false);
			
		}
		
		return false;
		
		
	}
	public static boolean isTeen(int d) {
		
		if(d>=13&&d<=19) {
			
			System.out.println(true);
			
		}else {
			
			System.out.println(false);
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the numbers:");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		hasTeen(a, b, c);
	}

}
