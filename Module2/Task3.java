import java.util.Locale;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // // Task 3.4
        // int a = 137;
        // double b = 7;
        // double div = a / b;
        // System.out.println("div: " + div);

        // Locale currentLocale = Locale.getDefault();
        // System.out.println("curr.loc. " + currentLocale);
        // System.out.println("div.loc: " + div);
        // currentLocale = Locale.getInstance(Locale.GERMAN);
        // System.out.println("curr.loc. " + currentLocale);
        // System.out.println("div.loc: " + div);
        // // public PrintStream printf (Locale l, String format, Object ... args)

        // Task 3.5 input/print / formatted print

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter first number: ");
        String firstString = userInput.nextLine();
        int first = Integer.parseInt(firstString);
        System.out.println("Enter second number: ");
        String secondString = userInput.nextLine();
        int second = Integer.parseInt(secondString);
        System.out.println("Sum: " + (first + second));
        System.out.println("Diff: " + (first - second));
        System.out.println("Product: " + (first * second));
        // System.out.println("Distance (absolute amount): " + (Math.hypot(first,
        // second)));
        System.out.println("Mean: " + ((first + second) / 2));
        System.out.println("maximum value: " + (Math.max(first, second)));
        System.out.println("Min value: " + (Math.min(first, second)));

        userInput.close();
    }
}
