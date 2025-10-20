import java.util.Scanner;

class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your password: ");
            String password = sc.nextLine();

            if (password.length() < 8) {
                throw new WeakPasswordException("Weak password! Must be at least 8 characters long.");
            } else {
                System.out.println("Password accepted");
            }
        }
        catch (WeakPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}