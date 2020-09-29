package controlFlowStatement;

public class PerfectNumber {
	static int total;
	
	public static void main(String[] args) {
		
		isPerfectNumber(9);
	}
	public static boolean isPerfectNumber(int number) {
		
if(number<1) {
			
			return false;
		}else {
		for(int i=1; i<number;i++) {
			if(number%i==0) {
				
				total=i;
			}
			 
			total++;
		}
	  
		
		if(total==number) {
			return true;
		}else {
			return false;
		}
		}
	}
	

}
