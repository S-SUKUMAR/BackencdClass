//Method Overloading
class Max{
	//overloading the method for different data types
	static void max(int a,int b) {
       System.out.println(a>b?a:b);
	}
    static void max(double a , int b) {
		System.out.println(a>b?a:b);
	}
    static void max(int a , double b) {
		System.out.println(a>b?a:b);
	}
	static void max(double a,double b) {
		System.out.println(a>b?a:b);
	}
}
public class MaxOfTwoNumbers {
	public static void main(String[] args) {
		Max m = new Max();
		m.max(10,20);
		m.max(0.3,4.2);
		m.max(10.2,5);
		m.max(5,2.25);

	}

}
