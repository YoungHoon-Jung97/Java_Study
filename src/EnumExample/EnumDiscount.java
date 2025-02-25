package EnumExample;



public class EnumDiscount
{
	public int discount(EnumGrade grade , int price) {
		
		return price * grade.getDiscount() /100;
	}
}
