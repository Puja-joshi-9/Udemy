package controlFlowStatement;

public class SumOddRange {
	
	public static void main(String[] args) {
		
		sumOdd(3, 10);
	}
	
	public static boolean isOdd(int number) {
		if(number<0) {
			return false;
		}
		else {
			
			if(number%2==0) {
				return false;
			}else {
				return true;
			}
		}
		
		
	}
	
	
		public  static int sumOdd(int start, int end){

		    int sum = 0;

		    if ((end < start) || (end < 0) || (start < 0)){

		        return -1;

		    }

		    for (int i = start; i <= end; i++){

		        if (isOdd(i)){

		            sum += i;

		        }

		    }

		    System.out.println(sum); 
             return sum;
		}
	

}
