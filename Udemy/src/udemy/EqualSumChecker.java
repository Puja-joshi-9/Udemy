package udemy;

import java.util.Scanner;

public class EqualSumChecker {
	
	public static boolean hasEqualSum(int a,int b, int c) {
		
		if((a+b)==c) {
			System.out.println(true);
		}
		System.out.println(false);
		return false;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the numbers:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		hasEqualSum(a, b, c);
		
	}

}
