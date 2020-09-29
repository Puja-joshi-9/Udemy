package Assignment6;

public class Q1 {
	public static void main(String args[]) {
		AClass ref1 = new AClass(5);
		AClass ref2 = new AClass(10);
		System.out.println(ref1.add(ref2));
	}// end main()
}// end class definition

class AClass {
	private int x;

	AClass(int x) {// constructor
		this.x = x;
	}// end constructor

	int add(AClass ref) {
		return x + ref.x;
	}// end add()
}// end class AClas
