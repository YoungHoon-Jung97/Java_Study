package stringExample;

public class TestString9
{
	public static void main(String[] args)
	{
		String fruits ="apple,banna,mango";
		
		String[] arr = fruits.split(",");
		
		
		for (String fruit : arr)
		{
			System.out.println(fruit);
		}
		
		String joinedString = String.join("->", arr);
		
		System.out.println("joinedString : " + joinedString);
	}
}
