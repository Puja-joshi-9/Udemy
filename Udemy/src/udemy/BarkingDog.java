package udemy;

public class BarkingDog {
	
	public static void shouldWakeUp(boolean barking, int hourOfDay) {
		
		
		if(barking==true) {
			
			if((hourOfDay<8 || hourOfDay>22 )&& (hourOfDay>0 || hourOfDay<=23)) {
				
				
				System.out.println(true);
			
			}
			else {
				System.out.println(false);
				
		
			}
		}else {
			
		   System.out.println(false);}
		}
	
		

	public static void main(String[] args) {
		
		shouldWakeUp(true, -1
				);
	}
}
