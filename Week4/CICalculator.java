import java.util.Scanner;
public class CICalculator {
    public static double calculateCI(double principal, double rate, int time, int n) {
        return principal * Math.pow(1 + (rate / (n * 100)), n * time);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter annual interest rate (in %): ");
        double rate = sc.nextDouble();
        System.out.print("Enter time (in years): ");
        int time = sc.nextInt();
        System.out.print("Enter number of times interest is compounded per year: ");
        int n = sc.nextInt();
        double amount = calculateCI(principal, rate, time, n);
        double cI = amount - principal;
        // Displaying result
        System.out.printf("Final Amount: %.2f\n", amount);
        System.out.printf("Compound Interest: %.2f\n", cI);
    }
}
