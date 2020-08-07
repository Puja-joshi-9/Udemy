package assignment5;

import java.util.Scanner;

public class LargestNumber {
	
	public static void main(String[] args) {
		
		int a , b , c , value1, value2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers :");
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();	
		
		value1= a>b ? a:b;
		value2=value1>c ? value1:c;
		
		System.out.println("The largest number among "+a+","+b+" and "+c+" is "+value2+".");
	}

}
