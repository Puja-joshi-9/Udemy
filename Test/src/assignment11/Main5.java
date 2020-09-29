package assignment11;

	public class Main5
	{
	public static void main(String[] args)
	{
	int result = new Calculate()
	{
	@Override
	int add(int a, int b)
	{
	return a+b;
	}
	}.add(11010, 22011);

	System.out.println(result);

	}
}
