package generic.test.ex4;

public class MethodMain1 {
	public static void main(String[] args) {
		Integer i = 10;
		
		Object object = GenericMethod.objMethod(i);
		
		
		System.out.println("명시적 타입 인자 전달");
		Integer  result = GenericMethod.<Integer>genericMethod(i);
		Integer integerValue = GenericMethod.<Integer>numberMethod(10);
		Double doubleValue = GenericMethod.<Double>numberMethod(2.9);
	}
}
