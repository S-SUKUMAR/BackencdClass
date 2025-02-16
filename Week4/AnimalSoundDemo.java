class Animal {
    void sound() {
        System.out.println("Animals make different sounds.");
    }
}
class Dog extends Animal{
    void sound() {
        System.out.println("Dog barks: Woof woof!");
    }
}
class Puppy extends Dog {
    void sound() {
        System.out.println("Puppy whines: Yip yip!");
    }
}
public class AnimalSoundDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound(); // Calling Animal's sound()
        Animal d = new Dog();
        d.sound(); // Calling Dog's sound()
        Animal p = new Puppy();
        p.sound(); // Calling Puppy's sound()
    }
}
