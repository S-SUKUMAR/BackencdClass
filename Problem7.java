import java.util.Scanner;
import java.lang.*;
public class Problem7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to find Perfect Square or not:");
		int n=sc.nextInt();
		int s=(int)Math.sqrt(n);
		if(n==(s*s))
			System.out.println("The Given Number is Perfect Square!!!");
		else
			System.err.println("The Given Number is not a Perfect Square###");

	}

}
