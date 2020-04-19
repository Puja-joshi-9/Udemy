package New;

import java.util.Scanner;

public class OddEven {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter the number: ");
		
		int n = sc.nextInt();
	   	
	
		while (!(n > 0 && n <= 100)) {
			System.out.print("Number entered is not valid. Please enter another number: ");
			n = sc .nextInt();
			}

		if(n%2==0) {
			System.out.println(n + " is even number");
		}
		else
		{
			System.out.println(n + " is odd number");
		}
		
		}
	
	

}
