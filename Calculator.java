import java.util.Scanner;

interface Operation {
    double calculate(double a, double b);
}

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Anonymous classes for each operation
        Operation addition = new Operation() {
            @Override
            public double calculate(double a, double b) {
                return a + b;
            }
        };

        Operation subtraction = new Operation() {
            @Override
            public double calculate(double a, double b) {
                return a - b;
            }
        };

        Operation multiplication=new Operation() {
            @Override
            public double calculate(double a , double b){
                return a*b;
            }
        };

        Operation division = new Operation() {
            @Override
            public double calculate(double a, double b) {
                if (b == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return Double.NaN;
                }
                return a / b;
            }
        };

        // CLI for user input
        while (true) {
            System.out.println("\nSimple CLI Calculator");
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double result;
            switch (choice) {
                case 1:
                    result = addition.calculate(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = subtraction.calculate(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = multiplication.calculate(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    result = division.calculate(num1, num2);
                    if (!Double.isNaN(result)) {
                        System.out.println("Result: " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
