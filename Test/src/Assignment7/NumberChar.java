package Assignment7;

import java.util.Scanner;

public class NumberChar {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int x = sc.nextInt();
		
		char y = (char)x;
		System.out.println("Character representation of "+x+" is "+ (char)y);
	}


}
