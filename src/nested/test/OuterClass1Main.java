package nested.test;

import nested.test.OuterClass1.NestedClass;

public class OuterClass1Main
{
	public static void main(String[] args)
	{
		OuterClass1.NestedClass nestedClass = new OuterClass1.NestedClass();
		
		nestedClass.hello();
	}

}
