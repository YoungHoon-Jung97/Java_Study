package generic.ex1;

public class BoxMain1
{
	public static void main(String[] args)
	{
		IntegerBox integerBox = new IntegerBox();
		
		integerBox.set(10);
		Integer integer = integerBox.get();
		System.out.println("integer = " + integer);
		
		StringBox stringBox = new StringBox();
		stringBox.setValue("hello");
		String str = stringBox.getValue();
		System.out.println("str = "+str);
		
	}
}
