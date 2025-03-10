package abstraction;

abstract class shape{
	abstract void area();
}
class circle extends shape{
	private double radius;
    circle(double radius) {
		this.radius=radius;
	}
	void area() {
		System.out.println("Circle area = "+String.format("%.2f",Math.PI*radius*radius));
		
	}
}
class rectangle extends shape{
	private double length,width;
	rectangle(double length,double width) {
		this.length=length;
		this.width=width;
	}
	void area() {
		System.out.println("Rectangle area = "+(length*width));
		
	}
}
public class Abstract_shape {

	public static void main(String[] args) {
		shape circle = new circle(5.5);
		shape rectangle= new rectangle(8,12);
		circle.area();
		rectangle.area();
	}

}
