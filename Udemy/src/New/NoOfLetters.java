package New;

import java.util.Scanner;

public class NoOfLetters {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		
		String string=sc.nextLine();
		
		int a = 0 , b= 0 , c =0 ;
		
		for(int i =0; i < string.length();i++) {
			
			char ch = string.charAt(i);
			if(ch == 'a') {
				a++;
			}else if(ch == 'b') {
				b++;
			}else if(ch == 'c') {
				c++;
			}
			 
		}
		
		System.out.println("Number of a's = "+a);
		System.out.println("Number of b's = "+b);
		System.out.println("Number of c's = "+c);
	}

}
