package assignment5;

import java.util.Scanner;

public class ThreeMethods {
	static int a, b, multiplication;

	public void first() {
		System.out.println(" Enter the value of two numbers:");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
	}

	public void second(int a, int b) {
		multiplication = a * b;

	}

	public void third(int a, int b, int multiplication) {
		System.out.println("The value is: " + multiplication);
	}

	public static void main(String[] args) {
		ThreeMethods obj = new ThreeMethods();
		obj.first();
		obj.second(a, b);
		obj.third(a, b, multiplication);
	}

}
