import java.util.Scanner;

// Custom exception for negative deposits
class NegativeDepositException extends Exception {
    public NegativeDepositException(String message) {
        super(message);
    }
}

// Bank class
class Bank {
    private double balance;

    public Bank() {
        this.balance = 0;
    }

    public void deposit(double amount) throws NegativeDepositException {
        if (amount < 0) {
            throw new NegativeDepositException("Cannot deposit a negative amount.");
        }
        balance += amount;
        System.out.println("Deposited: " + amount + ". New balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter amount to deposit ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                double amount = Double.parseDouble(input);
                bank.deposit(amount);
            } catch (NegativeDepositException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }

        scanner.close();
        System.out.println("Final balance: " + bank.getBalance());
    }
}
