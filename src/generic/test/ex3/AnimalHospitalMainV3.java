package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
	
	public static void main(String[] args) {
		AnimalHospitalV3<Dog> doghospital  = new  AnimalHospitalV3<>();
		AnimalHospitalV3<Cat> cathospital = new AnimalHospitalV3<>();
		
		Dog dog = new Dog("멍멍이1", 100);
		Cat cat =new Cat("냐옹이1",300);
		
		doghospital.set(dog);
		doghospital.checkup();
		
		cathospital.set(cat);
		cathospital.checkup();
		
		Dog biggerDog = (Dog)doghospital.bigger(new Dog("멍멍이2",200));
		System.out.println("biggerDog = "+ biggerDog);
		
	}
}
