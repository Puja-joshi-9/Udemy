package controlFlowStatement;

public class NumberPalindrome {
	
	public static void main(String[] args) {
		
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(-1214));
	}

	 public static boolean isPalindrome(int number){
		 
	     if(number<0)
	        number*=-1;
	        int originalNumber=number;
	        int reverseNumber=0;
	        
	     while(number>0){
	    	 
	         int lastDigit=number%10;
	         reverseNumber=(10*reverseNumber)+lastDigit;
	         number/=10;
	         
	     }
	     
	     if(reverseNumber==originalNumber)
	    	 
	     return true;
	     
	     else 
	    	 
	     
	     return false;
	 }
	} 
