package practice;

public class Polymorphism {
	
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int c= 10;
		int sum1 = sum(a,b);
		int sum2 = sum( a,  b,  c);
		System.out.println("First call to sum method: "+ sum1);
		System.out.println("Second call to sum method: " + sum2);
	}
	public static int sum(int a , int b) {
		int sum = a+b;
		return sum;
	}

	public static int sum(int a , int b,int c) {
		int sum = a+b+c;
		return sum;
	}
}
