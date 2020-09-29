package assignment4;

public class CallingFromSameMain {
	public static void main(String[] args) {
		int num = (int) (Math.random()*10);
		
		if(num>=4) 
			System.exit(0);
		else
			System.out.println("Success!!");
		
		main(new String[] {"Ram","Sita"});
	}

}
