package udemy;

public class BarkingDog {
	 
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
 
        if (barking == true && (hourOfDay < 8 || hourOfDay > 22)) {
           if(hourOfDay<0||hourOfDay>23){
               return false;
           }
           return true;
        }
        else{
            return false;
        }
    }



	public static void main(String[] args) {
		
		shouldWakeUp(true, -1
				);
	}
}
