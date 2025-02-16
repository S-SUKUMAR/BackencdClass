import java.util.Scanner;
public class Palindrome_Array {
	public static boolean isPalindrome(int a[]) {
		int i=0;
		int j=a.length-1;
		while(i<j) {
			if(a[i]!=a[j])
				return false;
		i++;
		j--;
		}
		return true;
	}

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of Elements:");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("Enter the "+n+" Elements");
       for(int i=0;i<n;i++) {
    	   arr[i]=sc.nextInt();
       }
       if(isPalindrome(arr))
        System.out.println("The Given Array is a Palindrome!!!");
       else
    	   System.out.println("The Given Array is not a Palindrome!!!");

}
}