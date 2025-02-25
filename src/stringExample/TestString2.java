package stringExample;

public class TestString2
{
	
	public static void main(String[] args) {
		
		String[] arr = {"hello", "java","jvm","spring" ,"jpa"};
		
		int sum = 0;
		
		for(String str : arr) {
			int result = str.length();
			
			System.out.println(str + " : " + result);
			sum += result;
		}
		System.out.println("sum : "+ sum);
	}
}
