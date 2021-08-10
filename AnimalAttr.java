
class Animal {
	public void sound() {
		System.out.println("Every animal has a sound");
	}

	public void noOfLegs() {
		System.out.println("Every animal has legs");
	}
}

class Dog extends Animal {
	public void sound() {
		System.out.println("\nSound of dog is bhaw bhaw");
	}

	public void noOfLegs() {
		System.out.println("dog has 4 legs");
	}
}

class BabyDog extends Dog {
	public void sound() {
		System.out.println("\nSound of baby dog is weeping");
	}

	public void noOfLegs() {
		System.out.println("dog has 4 legs");
	}
}

public class AnimalAttr {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog dog = new Dog();
		BabyDog babyDog = new BabyDog();
		animal.sound();
		animal.noOfLegs();
		dog.sound();
		dog.noOfLegs();
		babyDog.sound();
		babyDog.noOfLegs();
	}
}