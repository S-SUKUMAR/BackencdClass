import java.util.Scanner;
public class Problem6 {
	 public static String toWord(int number) {
	        // Array of words for single-digit numbers
	        String[] words = {"zero", "one", "two", "three", "four", 
	                          "five", "six", "seven", "eight", "nine"};

	        // Check if the number is within the single-digit range
	        if (number >= 0 && number <= 9) {
	            return words[number];
	        } else {
	            return "Invalid input! Please enter a single-digit number.";
	        }
	    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the Single Digit Number:");
		        int number =sc.nextInt(); // Replace this with any single-digit number for testing
		        System.out.println("The number " + number + " in words is: " + toWord(number));
		    }
	}
