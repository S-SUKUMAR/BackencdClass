package abstraction;


class AA {
    static void display() {
        System.out.println("Static method in Class A");
    }
    void print() {
        System.out.println("Instance method in Class A");
    }
}
class BB extends AA {
    void print() {
        System.out.println("Instance method in Class B");
    }
    static void display() {
        System.out.println("Static method in Class B");
    }
    
}
public class override_instance {
    public static void main(String[] args) {
        AA obj = new BB();
        obj.display(); 
        obj.print();
    }
}
