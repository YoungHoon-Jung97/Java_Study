package EnumExample;

public enum AuthGrade
{
	GUEST(1,"손님"),LOGIN(2,"로그인 회원"),ADMIN(3,"관리자");
	
	private int level = 0;
	private String description = "";
	
	private AuthGrade(int level,String description) {
		this.level = level;
		this.description = description;
	}
	
	public int getLevel() {
		
		return level;
	}
	public String getDescription() {
		return description;
	}
	
	public void print() {
		if (level == 3 )
		{
			System.out.println("====[메뉴]====");
			System.out.println("-메인 화면");
			System.out.println("-이메일 확인");
			System.out.println("-관리 화면");
		}
		else if (level ==2)
		{
			System.out.println("====[메뉴]====");
			System.out.println("-메인 화면");
			System.out.println("-이메일 확인");
		}
		else if (level == 1){
			System.out.println("====[메뉴]====");
			System.out.println("-메인 화면");
		}
	}
	
}
