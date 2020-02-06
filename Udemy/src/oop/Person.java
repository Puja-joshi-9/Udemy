package oop;

public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
	
	
	public String getfirstName() {
		
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		
		this.lastName = lastName;
	}
	
	public void setAge(int age) {
		
		if(age<0||age>100) {
			
			this.age=0;
		}
		this.age = age;
	}
	
	public boolean isTeen() {
		
		if(age>12&&age<20) {
			return true;
		}
		return false;
	}
	
	public String getfullName() {
		if(firstName.isEmpty()) {
			
			System.out.println(lastName);
			
		}if(lastName.isEmpty()){
			
			System.out.println(firstName);
			
		}if(firstName.isEmpty()&&lastName.isEmpty()) {
			
			System.out.println("");
		}
		
		System.out.println(firstName+" "+lastName);
		return null;
	}

}
