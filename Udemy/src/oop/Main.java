package oop;

public class Main {
	
	public static void main(String[] args) {
		
		Person Ram = new Person();
		Ram.setFirstName("Puja");
		Ram.setLastName("Joshi");
		Ram.getfullName();
		
		
		SumCalculator sum = new SumCalculator();
		sum.setFirstNumber(34);
		sum.setSecondNumber(20);
		sum.getMultiplicationResult();
	}

}
