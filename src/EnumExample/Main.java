package EnumExample;

public class Main
{
	public static void main(String[] args)
	{
		EnumDiscount grade = new EnumDiscount();
		
		int price = 10000;
		
		int diamond=grade.discount(EnumGrade.DIAMOND, price);
		
		System.out.println(diamond);
	}
}
