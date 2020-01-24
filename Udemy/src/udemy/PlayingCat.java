package udemy;

public class PlayingCat {
	
	public static boolean isCatPlaying(boolean summer , int temperature) {
		
		if((summer==true)&&(temperature>=25 && temperature<=45)) {
			
			System.out.println(true);
			
		}else if((summer==false)&&(temperature>=25 && temperature<=35)) {
			
			System.out.println(true);
			
		}
		System.out.println(false);
		return false;
		
	}
	
	public static void main(String[] args) {
		
		isCatPlaying(true, 20);
	}

}
