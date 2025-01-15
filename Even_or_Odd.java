import java.util.Scanner;
public class Even_or_Odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		/*if(n%2==0)
			System.out.println("The Given Number is EVEN");
		else
			System.out.println("The Given Number is ODD");
	*/
		//Using Ternary Operator
		String s=n%2==0 ? "The Given Number is EVEN":"The Given Number is ODD";
		System.out.println(s);
		}

}
