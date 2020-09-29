package Assignment7;

import java.util.Scanner;

public class CharNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character:");
		char x = sc.next().charAt(0);
		
		int y = (int)x;
		System.out.println("Number representation of "+x+" is "+ y);
	}

}
