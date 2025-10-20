import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if (age < 18) {
                throw new InvalidAgeException("NOT ELIGIBLE TO VOTE");
            } else {
                System.out.println("YOU ARE ELIGIBLE TO VOTE");
            }
        }
        catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());

        }
        sc.close();
    }
}