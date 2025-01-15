import java.util.Scanner;
public class Sum_of_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Getting the value
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
		// Calculating the Sum Of the given number from 1.
		long sum=(n*++n)/2;
		System.out.println(sum);

	}

}
