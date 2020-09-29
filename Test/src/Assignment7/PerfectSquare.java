package Assignment7;

import java.util.Scanner;

public class PerfectSquare {
	
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
	   int x = sc.nextInt();
		double y = Math.sqrt(x);
		
		 System.out.println("Square root of "+x+" is "+y+".");
		 
		 if(y ==(int)y) {
			 System.out.println(x+" is perfect square.");
		 }else
			 System.out.println(x+" is not perfect square.");
		
	}

}
