package Assignment7;

import java.util.Scanner;

public class BinaryNumber {
	public static long convertToBinary(int number) {
		long binaryNumber = 0;
		int remainder, a;
		for (a = 1; number != 0; a = a * 10) {
			remainder = number % 2;
			number /= 2;
			binaryNumber += remainder * a;
		}
		return binaryNumber;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number:");
		int number = sc.nextInt();
		System.out.println("Binary representation of " + number + " is " + convertToBinary(number));

	}

}
