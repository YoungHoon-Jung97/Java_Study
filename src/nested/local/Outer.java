package nested.local;

public class Outer
{
	private String outerField ="외부클래스 변수";
	
	void outerMethod() {
		
		int localVar = 100;
		
		class LocalInner {
			void display() {
				
				System.out.println("외부 클래스 필드 : " + outerField);
				System.out.println("메서드 지역 변수 : " + localVar);
			}
			
		}
		

		LocalInner localInner = new LocalInner();
		localInner.display();
		
	}
	
}
