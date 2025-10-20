class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) throws ArithmeticException {
        if (amount > balance) {
            throw new ArithmeticException("Insufficient balance! Withdrawal not allowed.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! New balance: " + balance);
        }
    }
}

public class BankTransaction {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);

        try {
            System.out.println("Attempting to withdraw ₹6000...");
            account.withdraw(6000);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Attempting to withdraw ₹2000...");
        account.withdraw(2000);
    }
}