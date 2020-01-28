package controlFlowStatement;

public class FirstLastDigitSum {
	
	public static void main(String[] args) {
		
		System.out.println(SumFirstAndLastDigit(121));
		System.out.println(SumFirstAndLastDigit(-121));
		System.out.println(SumFirstAndLastDigit(11));
		System.out.println(SumFirstAndLastDigit(5));
	}
	
	public static int SumFirstAndLastDigit(int number) {
		
		if(number<0) {
			return -1;
		}
		
		int firstDigit =0;
		int lastDigit = number%10;
		
		while(number>0) {
			
			int remainder = number% 10;
			firstDigit = remainder;
			number = number/10;
			
		}
		int sum =firstDigit+lastDigit; 
		return sum;
	}

}
