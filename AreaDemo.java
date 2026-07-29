import java.util.Scanner;

abstract class Shape {
    abstract void printArea();
}

class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

       void printArea() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

class Triangle extends Shape {
    int base, height;

    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

       void printArea() {
        System.out.println("Area of Triangle = " + (0.5 * base * height));
    }
}

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

        void printArea() {
        System.out.printf("Area of Circle = %.2f%n", Math.PI * radius * radius);
    }
}

public class AreaDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Shape");
        System.out.println("1. Rectangle");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        Shape shape;

        switch (choice) {
            case 1:
                System.out.print("Enter Length: ");
                int length = sc.nextInt();

                System.out.print("Enter Breadth: ");
                int breadth = sc.nextInt();

                shape = new Rectangle(length, breadth);
                shape.printArea();
                break;

            case 2:
                System.out.print("Enter Base: ");
                int base = sc.nextInt();

                System.out.print("Enter Height: ");
                int height = sc.nextInt();

                shape = new Triangle(base, height);
                shape.printArea();
                break;

            case 3:
                System.out.print("Enter Radius: ");
                int radius = sc.nextInt();

                shape = new Circle(radius);
                shape.printArea();
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}