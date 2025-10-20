import java.util.Scanner;

public class SquareRootCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
try {
    System.out.print("Enter a number: ");
    double num = sc.nextDouble();

            if (num < 0) {
     throw new ArithmeticException("Number cannot be negative");
            } else {
                double result = Math.sqrt(num);
   System.out.println("Square root: " + result);
    }
        }
        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}