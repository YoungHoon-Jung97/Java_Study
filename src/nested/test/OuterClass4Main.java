package nested.test;

public class OuterClass4Main
{
	public static void main(String[] args)
	{
		Hello obj = new Hello() {
			@Override
			public void hello()
			{
				System.out.println("익명 클래스");
				
			}
		};
		
		obj.hello();
		
	}
}
