package EnumExample;

public class AuthGradeMain
{
	public static void main(String[] args)
	{
		for (AuthGrade arr : AuthGrade.values())
		{
			printValue(arr);
		}
	}
	
	public static void printValue(AuthGrade arr) {
		System.out.println("이름 : "+arr.name()+" level: " + arr.getLevel()+"description : " + arr.getDescription());
	}
}
