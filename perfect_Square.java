import java.util.Scanner;
public class perfect_Square {
//  n = 6
//	Proper Divisors of 6 are 1, 2 and 3.
//	Sum = 1+2+3 = 6 = 6
//	 6 is a perfect number
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
		int sum=1;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				sum+=i;	
		}
		if(sum==n) 
		System.out.println("It is a Perfect Square!!!");
		else
			System.out.println("It is not a Perfect Square!!!");
	}
}
