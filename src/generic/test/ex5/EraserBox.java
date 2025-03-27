package generic.test.ex5;

import generic.animal.Dog;
import sun.net.www.content.audio.aiff;

public class EraserBox<T extends Dog>
{
	public boolean instanceCheck(Object param) {
		//return param instanceof T;
		return false;
	}
	
	public void create() {
		//return new T();
		
	}
}
