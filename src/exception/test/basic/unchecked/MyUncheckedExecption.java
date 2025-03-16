package exception.test.basic.unchecked;

public class MyUncheckedExecption extends RuntimeException
{

	public MyUncheckedExecption(String message) {
		super(message);
	}
}
