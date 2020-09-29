
	package assignment3;

	import java.util.Scanner;

	public class ThreeMethods1 {
		static int a, b, multiplication;
		
		public static void main(String[] args) {
			ThreeMethods1.first(a,b);
			ThreeMethods1.second();
			ThreeMethods1.third(a,b,multiplication);
		}


		public static void first(int a , int b) {
			System.out.println(" Enter the value of two numbers:");
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			b = sc.nextInt();
			sc.close();
			
		}

		public static void second() {
			
			 multiplication = a * b;

		}

		public static int third(int a , int b ,int multiplication) {
			
			System.out.println("The value is: " + multiplication);
			return multiplication;
		}

		
	}



