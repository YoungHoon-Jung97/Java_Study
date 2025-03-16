package exception.test.basic.unchecked;

import exception.test.basic.checked.MyCheckedException;

public class Service
{
	Client client = new Client();
	
	public void callCatch() {
		try
		{
			client.call();
		} catch (MyUncheckedExecption e)
		{
			System.out.println("예외 처리, message = " + e.getMessage());
		}
		System.out.println("정상 로직");
	}
	
	public void callThrow() {
		
		client.call();
	}
}
