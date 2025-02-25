package EnumExample;

public enum EnumGrade
{
	BASIC(10),GOLD(20),DIAMOND(30);
	
	private int discount = 0;
	
	private EnumGrade(int discount) {
		this.discount = discount;
	}
	
	public int getDiscount() {
		return discount;
	}
}
