import java.util.Scanner;
public class ParallelogramAreaCalculator {
    public static double calculateArea(double base, double height) {
        return base * height;
    }
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of the parallelogram: ");
       double base = sc.nextDouble();
        System.out.print("Enter the height of the parallelogram: ");
       double height = sc.nextDouble();
      double area = calculateArea(base, height);
       System.out.printf("Area of the parallelogram: %.2f\n", area);
    }
}
