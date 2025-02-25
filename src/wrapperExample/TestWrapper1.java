package wrapperExample;

public class TestWrapper1
{
	public static void main(String[] args)
	{
		String str1 = "10";
		String str2 = "20";
		
		int result1 = Integer.parseInt(str2)+Integer.parseInt(str1);
		
		System.out.println(result1);
		
		
		String str3 = "23.4";
		String str4 = "330.35";
		
		double result2 = Double.parseDouble(str3) + Double.parseDouble(str4);
		
		System.out.println(result2);
	}
}
