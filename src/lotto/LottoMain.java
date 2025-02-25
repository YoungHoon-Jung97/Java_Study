package lotto;

import java.io.ObjectInputStream.GetField;

public class LottoMain
{
	public static void main(String[] args)
	{
		LottoGenerator generator = new LottoGenerator();
		
		int[] result = generator.generante();
		
		for (int i : result)
		{
			System.out.println(i);
		}
	}
}
