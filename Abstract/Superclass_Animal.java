package abstraction;

class Animal{
	void sound() {
		System.out.println("Animal make some generic sound!!!");
	}
}
class dog extends Animal{
	void sound() {
		System.out.println("Dog sound: Woof! Woof!");
	}
}
class cat extends Animal{
	void sound() {
		System.out.println("cat sound: Meow! Meow!");
	}
}
public class Superclass_Animal {
	static void makesound(Animal animal) {
		animal.sound();
	}
	public static void main(String[] args) {
		Animal mydog = new dog();
		Animal mycat = new cat();
		makesound(mydog);
		makesound(mycat);
	}

}
