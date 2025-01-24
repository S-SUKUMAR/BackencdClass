class person{
	String name;
	int age;
	person(){
		System.out.println("Zero-Parameterized Constructor");
		name="Rose";
		age=23;
		System.out.println(name);
		System.out.println(age);
	}
	person(String name,int age){
		System.out.println("Parameterized Constructor");
		this.name=name;
		this.age=age;
		System.out.println(name);
		System.out.println(age);
	}
}
public class constructor1 {

	public static void main(String[] args) {
	// calling the default or zero-parameterized constructor
	person p = new person();
	// calling the parameterized constructor
		person p1 = new person("Jack",24);
	

	}

}
