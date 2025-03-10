package abstraction;


class A{
	void display() {
		System.out.println("Class A");
	}
}
class B extends A{
	void display() {
		super.display();
		System.out.println("Class B");	
}	
}
public class superclass {
	public static void main(String[] args) {
	 A obj = new B();
	 obj.display();
	}
}
