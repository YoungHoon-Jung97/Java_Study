package generic.test.ex2;

public class PairTest
{
	public static void main(String[] args)
	{
		Pair<Integer, String> pair1 = new Pair<>();
		pair1.setFirst(1);
		pair1.setSecont("data");
		System.out.println(pair1.getFirst());
		System.out.println(pair1.getSecont());
		System.out.println("pair1 = "+ pair1);
		
		Pair<String, String> pair2 = new Pair<>();
		pair2.setFirst("key");
		pair2.setSecont("value");
		System.out.println(pair2.getFirst());
		System.out.println(pair2.getSecont());
		System.out.println("pair2 = " +pair2);
	}
}
