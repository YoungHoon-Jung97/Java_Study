package EnumExample;

public class UpgradeDiscount
{
	public int discount(UpgradeGrade grade , int price) {

		return price * grade.getDiscount()/100; 
	}
}
