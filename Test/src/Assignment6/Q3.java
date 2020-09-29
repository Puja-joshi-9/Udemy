package Assignment6;

public class Q3 {

	public static void main(String args[]) {
		SubClass ref1 = new SubClass(5);
		SubClass ref2 = new SubClass(10);
		System.out.println(ref1.add(ref2));
	}// end main()
}// end class definition



class SubClass extends AClass {
	SubClass(int x) {
		super(x);
	}// end constructor

	int add(AClass ref) {
		return x + ref.x;
	}// end add()
}// end class SubClass
