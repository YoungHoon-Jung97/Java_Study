package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain1
{
	public static void main(String[] args)
	{
		Animal animal =new Animal("동물", 0);
		Dog dog = new Dog("멍멍이", 100);
		Cat cat = new Cat("냐옹이", 50);
		
		Box<Animal> dogBox = new Box<>();
		dogBox.set(dog);
		Animal findDog = dogBox.get();
		System.out.println("findDog ="+findDog);
		
		Box<Animal> catBox = new Box<>();
		catBox.set(cat);
		Animal findCat = catBox.get();
		System.out.println("findCat =" +findCat);
	}
}
