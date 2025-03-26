package generic.test.ex3;

import generic.animal.Animal;
import generic.animal.Cat;

public class AnimalHospitalV3 <T extends Animal> {

	private Animal animal;

	public Animal get() {
		return animal;
	}

	public void set(T  animal) {
		this.animal = animal;
	}
	

	public void checkup() {
		System.out.println("동물 이름 : " +animal.getName());
		System.out.println("동물 크기 : " +animal.getSize());
		animal.sound();
	}
	
	public Animal bigger(T target) {
		return animal.getSize() > target.getSize() ? animal : target;
	}
}
