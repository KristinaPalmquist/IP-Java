import java.util.Scanner;

public class PartTwo {
    public static void main(String[] args) {

        // // Example showing the concept of operator precedence and associativity
        // // Initialize the variables
        // int a = 10;
        // int b = 20;
        // int c = 30;

        // // Demonstrate operator precedence using arithmetic operators
        // int result1 = a + b * c; // result1 is equal to 610 (b * c is evaluated
        // first)
        // int result2 = (a + b) * c; // result2 is equal to 900 ((a + b) is evaluated
        // first)

        // System.out.println("Result 1: " + result1);
        // System.out.println("Result 2: " + result2);

        // // Demonstrate operator associativity using arithmetic operators
        // int result3 = a - b + c; // result3 is equal to 20 (left-to-right
        // associativity)
        // int result4 = a - (b + c); // result4 is equal to -40 (right-to-left
        // associativity)

        // System.out.println("Result 3: " + result3);
        // System.out.println("Result 4: " + result4);

        // //comparison operators
        // int a = 10;
        // int b = 10;
        // boolean result = (a == b); // result is true
        // System.out.println("Result: " + result);

        // int a = 10;
        // int b = 10;
        // boolean result1 = (a <= b); // result is true
        // boolean result2 = (a <= b); // result is true
        // System.out.println("Result1: " + result1);
        // System.out.println("Result2: " + result2);

        // int quotient = 10 / 3;
        // int remainder = 10 % 3;
        // System.out.printf("Q = %d and R = %d%n", quotient, remainder);
        // quotient--;
        // remainder++;
        // System.out.printf("Q = %d and R = %d%n", quotient, remainder);

        // int number = 10;
        // if (number > 0) {
        // System.out.println("Number is positive");
        // } else {
        // System.out.println("Number is negative or zero");
        // }

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int value = userInput.nextInt();
        int remainder = value % 2;
        if (remainder == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        if (value == 10) {
            System.out.println("Equal to 10");
        } else if (value > 10) {
            System.out.println("Greater than 10");
        } else {
            System.out.println("Less than 10");
        }
        userInput.close();
    }
}
