import java.util.Scanner;
public class CFG {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number to find the GCD");
		int n=sc.nextInt();
		int m=sc.nextInt();
		// Minimum of n and m
		int result=n>m?m:n;
		//finding the GCD of two numbers
		while(result>0) {
			if(n%result==0 && m%result==0)
				break;
			result--;
				}
		System.out.print("GCD of " + n + " and " + m + " is " + result);
	}
	}
