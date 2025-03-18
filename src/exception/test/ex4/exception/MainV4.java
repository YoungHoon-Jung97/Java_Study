package exception.test.ex4.exception;

import java.util.Scanner;

public class MainV4
{
	public static void main(String[] args) 
	{
		
		NetworkServiceV5 networkService = new NetworkServiceV5();
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			
			System.out.print("전송 문자: ");
			String input= scanner.nextLine();
			if (input.equals("exit"))
			{
				break;
			}
			
			try
			{
				networkService.sendMessage(input);
				
			} catch (Exception e)
			{
				exceptionHandler(e);
			}
			System.out.println();
		}
		System.out.println("프로그램을 정상 종료합니다.");
	}

	//공통예외 처리
	private static void exceptionHandler(Exception e)
	{
		System.out.println("메시지 : 죄송합니다. 알수 없는 문제가 발생했습니다.");
		System.out.println("===[개발자 메시지]===");
		e.printStackTrace(System.out);
		
		/*
		 * if (e instanceof SendExceptionV4 sendEx) {
		 * System.out.println("[전송 오류] 전송데이터 : " + sendEx.getSendData()); }
		 */
		
	}
}
