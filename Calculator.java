import java.util.Scanner;

public class Calculator {

    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }

    static double modulus(double a, double b) {
        return a % b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char again;

        do {

            System.out.println("\n===== CALCULATOR =====");

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            System.out.println("\n1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Result = " + add(a, b));
                    break;

                case 2:
                    System.out.println("Result = " + subtract(a, b));
                    break;

                case 3:
                    System.out.println("Result = " + multiply(a, b));
                    break;

                case 4:
                    if (b != 0) {
                        System.out.println("Result = " + divide(a, b));
                    } else {
                        System.out.println("Cannot divide by zero");
                    }
                    break;

                case 5:
                    if (b != 0) {
                        System.out.println("Result = " + modulus(a, b));
                    } else {
                        System.out.println("Cannot divide by zero");
                    }
                    break;

                default:
                    System.out.println("Invalid choice");
            }

            System.out.print("\nDo you want to calculate again? (Y/N): ");
            again = sc.next().charAt(0);

        } while (again == 'Y' || again == 'y');

        System.out.println("\nThank you for using Calculator!");

        sc.close();
    }
}