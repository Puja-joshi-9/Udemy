package udemy;

import java.util.Scanner;

public class GreaterNum {
	
	public static void main(String[] args) {
		
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers : ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b&&a>c) {
			System.out.println("The greatest number is: "+a);
		
		}else if(b>a&&b>c) {
			System.out.println("The greatest number is: "+b);
		}else if(c>a&&c>b) {
			System.out.println("the greatest number is: "+c);
		}else if(a==b&&b==c) {
			System.out.println("All are equal");
		}
				
	}

}
