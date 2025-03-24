package generic.ex1;

public class BoxMain2
{
	public static void main(String[] args)
	{
		ObjectBox objectBox = new ObjectBox();
		objectBox.set(10);
		Object object = objectBox.get();
		Integer integer  = (Integer)object;
		System.out.println("integer = " + integer);
		
		ObjectBox stringBox = new ObjectBox();
		stringBox.set("hello");
		String string = (String)stringBox.get();
		System.out.println("string = " + string);
	}

}
