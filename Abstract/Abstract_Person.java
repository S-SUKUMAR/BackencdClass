package abstraction;


abstract class Person {
    protected String name;
    protected int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    abstract void displayDetails();
}
class Student extends Person {
    private char grade;
    public Student(String name, int age, char grade) {
        super(name, age); // Calling superclass constructor
        this.grade = grade;
    }
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}
public class Abstract_Person {
    public static void main(String[] args) {
        // Superclass reference pointing to a Student object
        Person student = new Student("JACK", 20, 'A');
        student.displayDetails();
    }
}
