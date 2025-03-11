package nested.test;

public class OuterClass3
{
	
	public void createClass() {
		class LocalClass{
			
			public void hello() {
				System.out.println("지역 클래스");
			}
		}
		
		LocalClass localClass  = new LocalClass();
		localClass.hello();
		
	}
}
