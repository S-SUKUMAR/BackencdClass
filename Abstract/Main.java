class vehicle{
	protected void  start() {
		System.out.println("Vehicle Started!!!");
	}
}
class car extends vehicle{
	public void start() {
		System.out.println("Car Started!!!");
	}
}
public class Main {

	public static void main(String[] args) {
		vehicle vc = new car();
		vc.start();

	}

}
