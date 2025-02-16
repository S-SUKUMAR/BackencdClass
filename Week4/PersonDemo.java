class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Student extends Person {
    String grade;
    public Student(String name, int age, String grade) {
        super(name, age); // Call the Person constructor
        this.grade = grade;
    }
    public void display() {
        super.display(); 
        System.out.println("Grade: " + grade);
    }
}
class Teacher extends Person {
    String subject;
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    public void display() {
        super.display();
        System.out.println("Subject: " + subject);
    }
}
public class PersonDemo {
    public static void main(String[] args) {
        Student student = new Student("Alice", 18, "12th Grade");
        Teacher teacher = new Teacher("Mr. Smith", 40, "Mathematics");
        System.out.println("Student Details:");
        student.display();
      System.out.println("\nTeacher Details:");
        teacher.display();
    }
}
