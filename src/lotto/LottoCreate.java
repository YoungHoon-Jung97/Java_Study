package lotto;

import java.util.Random;

public class LottoCreate
{
	private int[] lotto;
	private int[] number;
	private Random random;
	
	public LottoCreate() {
		random = new Random();
		lotto = new int[6];
		number = new int[45];
	}
	
	public int[] create() {
		
		for(int i=0 ;i<number.length; i++ ) {
			number[i] = i + 1;
		}
		shuffle(number);
		
		return lotto;
	}
	
	private void shuffle(int[] number) {
		for(int i=0; i<number.length ;i++) {
			int randomInt =random.nextInt(45) +1;
			int temp = 0;
			
			temp=number[i];
			number[i] = number[randomInt-1];
			number[randomInt-1] = temp;
			
		}
		
		for (int i = 0; i < lotto.length; i++)
		{
			lotto[i] = number[i];
		}
		
	}
}
