package lotto;

import java.util.Random;

public class LottoGenerator
{
	private Random random  = new Random();
	private int[] lotto = new int[6];
	private int count;
	
	public int[] generante() {
		count = 0;
		
		while (count <6)
		{
			int number = random.nextInt(45)+1;
			
			if (inUnique(number))
			{
				lotto[count] = number;
				count++;
			}
			
		}
		
		return lotto;
	}
	
	private boolean inUnique(int number) {
		
		for (int i = 0; i < lotto.length; i++)
		{
			if(lotto[i] == number) {
				return false;
			}
			
		}
		return true;
	}
}
