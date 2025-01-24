class Book{
	String title;
	int price;
	Book(){
		System.out.println("Zero-Parameterized Constructor");
		title="Unknown Title";
		price=0;
		
	}
	Book(int price){
		this();// calling the Zero parameterized constructor
		System.out.println("Single Parameterized Constructor");
		this.price=price;
		
	}
	Book(String title,int price){
		this(100);// calling the single parameterized constructor
		System.out.println("Double Parameterized Constructor");
		this.price=price;
		this.title=title;
	}
	void display() {
		System.out.println(title);
		System.out.println(price);
	}
	
}
public class Constructor2 {

	public static void main(String[] args) {
	Book b2 = new Book("The White Tiger",5000);// calling the double parameterized constructor
	b2.display();
		
	}

}
