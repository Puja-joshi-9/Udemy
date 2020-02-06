package oop;

public class SumCalculator {
	
	private double firstNumber;
	private double secondNumber;
	
	
	public double getFirstnumber() {
		
		return firstNumber;
	}
	
	public double getSecondNumber() {
		
		return secondNumber;
	}
	
	public void setFirstNumber(double firstNumber) {
		
		this.firstNumber = firstNumber;
	}
	
	public void setSecondNumber(double secondNumber) {
		
		this.secondNumber = secondNumber;
	}
	
	public double getAdditionResult() {
		System.out.println(firstNumber+secondNumber);
		return 0;
		
	}
	
	public double getSubtractionResult() {
		System.out.println(firstNumber-secondNumber);
		return 0;
	}
	
	public double getMultiplicationResult() {
		System.out.println(firstNumber*secondNumber);
		return 0;
	}
	
	public double getDivisionResult() {
		
		if(secondNumber==0) {
			return 0.0;
		}
		System.out.println(firstNumber/secondNumber);
		return 0;
	}
	
	
	

}
