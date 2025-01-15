//Factorial
import java.util.Scanner;
public class Problem11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to find the Factorial:");
		int n=sc.nextInt();
		int sum=1;
		while(n>0) {
			sum*=n;
			n--;
		}
		System.out.println(sum);

	}

}
