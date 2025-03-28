package generic.test.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1
{
	public static void main(String[] args)
	{
		Box<Object> objBox = new Box<>();
		Box<Dog> dogBox = new Box<Dog>();
		Box<Cat> catBox = new Box<Cat>();
		
		dogBox.set(new Dog("멍멍이", 100) );
		
		WildcardEx.printGenericV1(dogBox);
		
		WildcardEx.printGenerciV2(dogBox);
		WildcardEx.printWildcardV2(dogBox);
		
		Dog dog = WildcardEx.printAndReturnGeneric(dogBox);
		
		catBox.set(new Cat("냐옹이",200));
		Cat cat = WildcardEx.printAndReturnGeneric(catBox);
		
		Animal animal = WildcardEx.printAndReturnWildcard(dogBox);
		
	}
}
