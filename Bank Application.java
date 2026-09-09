

import java.util.Scanner;

interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
}

class Bank implements BankAccount {
    double balance;

    Bank(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid deposit amount!");
        }

        balance = balance + amount;
        System.out.println("Amount deposited successfully.");
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid withdrawal amount!");
        }

        if (amount > balance) {
            throw new ArithmeticException("Insufficient balance!");
        }

        balance = balance - amount;
        System.out.println("Amount withdrawn successfully.");
    }

    public void checkBalance() {
        System.out.println("Current Balance: Rs." + balance);
    }
}

public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter initial balance: Rs.");
            double initialBalance = sc.nextDouble();

            if (initialBalance < 0) {
                throw new IllegalArgumentException("Invalid initial balance!");
            }

            Bank account = new Bank(initialBalance);

            System.out.print("Enter deposit amount: Rs.");
            double depositAmount = sc.nextDouble();
            account.deposit(depositAmount);

            account.checkBalance();

            System.out.print("Enter withdrawal amount: Rs.");
            double withdrawAmount = sc.nextDouble();
            account.withdraw(withdrawAmount);

            account.checkBalance();
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Invalid input!");
        }

        sc.close();
    }
}
