package assignment4;

import java.util.Scanner;

public class TwoMainMethods {

	public static void main(String[] args) {

		int a=0,b = 0;
		main(a,b);

	}

	public static void main(int a, int b) {
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a + b;
		System.out.println("sum = " + c);
	}

}
