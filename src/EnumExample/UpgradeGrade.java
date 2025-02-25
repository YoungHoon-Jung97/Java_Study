package EnumExample;

public class UpgradeGrade
{
	public static final UpgradeGrade BASIC = new UpgradeGrade(10);
	public static final UpgradeGrade GOLD = new UpgradeGrade(20);
	public static final UpgradeGrade DIAMOND = new UpgradeGrade(30);
	
	
	private int discount = 0;
	
	private UpgradeGrade(int discount) {
		this.discount = discount;
	}
	
	public int getDiscount() {
		return discount;
	}

}
