package controlFlowStatement;

public class DigitSumChallenge {
	
	public static void main(String[] args) {
		
		System.out.println("The sum of digits of number 124 is "+SumDigits(124));
		System.out.println("The sum of digits of number 1 is "+SumDigits(1));
		System.out.println("The sum of digits of number 1245 is "+SumDigits(1245));
		System.out.println("The sum of digits of number -124 is "+SumDigits(-124));
		
	}
	
	public static int SumDigits(int number) {
		
		if(number < 10) {
			return -1;
		}
		
		int sum = 0;
		
		
//		125 -> 125/10= 12 -> 12*10 = 120 -> 125-120 = 5
		
		while(number>0) {
			
//			extract the least significant digit
			
			int digit =number%10;
			sum += digit;
			
//			drop the least significant digit
			
			number /= 10;   // same as number = number/10
			
		}
		return sum;
	}

}
