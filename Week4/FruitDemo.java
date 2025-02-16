class Fruit {
    String name;
    String color;
    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public void display() {
        System.out.println("Fruit Name: " + name);
        System.out.println("Color: " + color);
    }
}
class Apple extends Fruit {
    String shape;
    String size;
    public Apple(String name, String color, String shape, String size) {
        super(name, color); // Call the Fruit constructor
        this.shape = shape;
        this.size = size;
    }
    public void display() {
        super.display(); // Call Fruit's display method
        System.out.println("Shape: " + shape);
        System.out.println("Size: " + size);
    }
}

class Kiwi extends Fruit {
    String shape;
    String size;
    public Kiwi(String name, String color, String shape, String size) {
       super(name, color); 
       this.shape = shape;
       this.size = size;
    }
    public void display() {
       super.display(); 
        System.out.println("Shape: " + shape);
        System.out.println("Size: " + size);
    }
}
public class FruitDemo {
    public static void main(String[] args) {
         Apple apple = new Apple("Apple", "Red", "Round", "Medium");
         Kiwi kiwi = new Kiwi("Kiwi", "Brown", "Oval", "Small");
       System.out.println("Apple Details:");
       apple.display();
       System.out.println("\nKiwi Details:");
        kiwi.display();
    }
}
