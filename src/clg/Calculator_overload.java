package clg;

import java.util.Scanner;

public class Calculator_overload {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calc calc = new Calc();
        int choice;

        System.out.println("Welcome to the Enhanced Calculator!");

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add (2 numbers)");
            System.out.println("2. Add (3 numbers)");
            System.out.println("3. Subtract (2 numbers)");

            System.out.println("4. Multiply (2 numbers)");
            System.out.println("5. Multiply (3 numbers)");
            System.out.println("6. Divide (2 numbers)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
                System.out.print("Enter your choice: ");
            }
            choice = sc.nextInt();

            int num1, num2, num3;

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextInt();
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + calc.add(num1, num2));
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextInt();
                    System.out.print("Enter third number: ");
                    num3 = sc.nextInt();
                    System.out.println("Result: " + num1 + " + " + num2 + " + " + num3 + " = " + calc.add(num1, num2, num3));
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextInt();
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + calc.subtract(num1, num2));
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextInt();
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + calc.multiply(num1, num2));
                    break;

                case 5:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextInt();
                    System.out.print("Enter third number: ");
                    num3 = sc.nextInt();
                    System.out.println("Result: " + num1 + " * " + num2 + " * " + num3 + " = " + calc.multiply(num1, num2, num3));
                    break;

                case 6:
                    System.out.print("Enter dividend: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter divisor: ");
                    num2 = sc.nextInt();
                    double divisionResult = calc.divide(num1, num2);
                    if (!Double.isNaN(divisionResult)) {
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + divisionResult);
                    }
                    break;

                case 0:
                    System.out.println("Exiting Calculator. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number from the menu.");
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}
