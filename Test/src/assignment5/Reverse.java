package assignment5;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		int num , reverse=0;

		System.out.println("Enter the number to be reversed:");
		Scanner sc = new Scanner(System.in);
		
		num=sc.nextInt();
		
		while(num!=0) {
			reverse = reverse * 10;
			reverse = reverse + num%10;
			num = num/10;
			
		}
		System.out.println("The reverse of given number is "+reverse+".");
		
	}
}
