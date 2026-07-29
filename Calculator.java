import java.util.Scanner;

interface Operation {
    int add(int a, int b);
    int sub(int a, int b);
    int mul(int a, int b);
    int div(int a, int b);
}

class Arithmetic implements Operation {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }
}

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Operation obj = new Arithmetic();

        int choice;

        do {
            System.out.println("\n===== Calculator Menu =====");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    int a = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b = sc.nextInt();
                    System.out.println("Result: " + obj.add(a, b));
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    a = sc.nextInt();
                    System.out.print("Enter second number: ");
                    b = sc.nextInt();
                    System.out.println("Result: " + obj.sub(a, b));
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    a = sc.nextInt();
                    System.out.print("Enter second number: ");
                    b = sc.nextInt();
                    System.out.println("Result: " + obj.mul(a, b));
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    a = sc.nextInt();
                    System.out.print("Enter second number: ");
                    b = sc.nextInt();
                    System.out.println("Result: " + obj.div(a, b));
                    break;

                case 5:
                    System.out.println("Exiting Calculator... Thank you!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

        sc.close();
    }
}