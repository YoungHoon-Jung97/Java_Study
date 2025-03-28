package generic.ex1;

public class BoxMain3
{
	public static void main(String[] args)
	{
		GenericBox<Integer> integerBox = new GenericBox<Integer>();
		integerBox.set(10);
		//integerBox.set("hello"); 에러 발생
		Integer integer = integerBox.get();
		System.out.println("integer =" +integer);
		
		GenericBox<String> stringBox = new GenericBox<String>();
		stringBox.set("hello");
		String string = stringBox.get();
		System.out.println("string = "+string);
		
		GenericBox<Integer> integer2 = new GenericBox<>();
		//코드 안전성과 재사용성 향상
	}
}
