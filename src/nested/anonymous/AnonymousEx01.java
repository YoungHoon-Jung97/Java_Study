package nested.anonymous;

import java.util.Random;

public class AnonymousEx01
{

	
	public static void hello(int i) {
		
		System.out.println("프로그램 시작");
		if (i %2 ==0)
		{
			AnonymousEx01.sum();
		}
		else {
			
			AnonymousEx01.dice();
		}
		
		System.out.println("프로그램 종료");
	
	}
	
	public static void sum() {
		
		for(int i =0;i <=3 ;i++) {
			
			System.out.println("i = " + i);
		}
		
	}
	public static void dice() {
		
		int randomValue = new Random().nextInt(6) + 1;
		System.out.println("주사위 수 :" + randomValue);
		
	}
	
	
	public static void main(String[] args)
	{
		
		AnonymousEx01.hello(2);
		
		
	}
}
