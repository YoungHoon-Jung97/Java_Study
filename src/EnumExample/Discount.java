package EnumExample;

public class Discount
{
	public int discount(Grade grade , int price) {
		int result = 0 ;
		
		if (grade == Grade.BASIC)
		{
			result = 10;
		}
		else if(grade == Grade.GOLD) {
			result = 20;
		}
		else if(grade == Grade.DIAMOND) {
			result = 30;
		}
		else
		{
			System.out.println("할인이 되지 않습니다.");
		}
		
		return price *result /100; 
	}
}
