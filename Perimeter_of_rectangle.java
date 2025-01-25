//Method Overloading
class Power{
// Perimeter of Rectangle = 2 * (Length + Breadth)
	static void power(int base,int exp) {
       System.out.println(Math.round(Math.pow(base,exp)));
       
	}
    static void power(double base , int exp) {
    	System.out.println(Math.pow(base,exp));
	}
    static void power(int base , double exp) {
    	System.out.println(Math.pow(base,exp));
	}
	static void power(double base,double exp) {
		System.out.println(Math.pow(base,exp));
	}
}
public class Perimeter_of_rectangle {
	public static void main(String[] args) {
		Power pm = new Power();
		pm.power(10,20);
		pm.power(20.5,5);
		pm.power(10.2,5);
		pm.power(5,2.25);

	}

}
