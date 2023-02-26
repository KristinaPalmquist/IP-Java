
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        String ageString = scanner.nextLine();
        int age = Integer.parseInt(ageString);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println(
                "Your name is " + name + " and you are " + age + " years old.");
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter your age: ");
        // String ageString = scanner.nextLine();
        // int age = Integer.parseInt(ageString);
        // String name = scanner.nextLine();
        // System.out.println("Your name is " + name + " and you are " + age + " years
        // old.");

        // userInput.useDelimiter("*"); // Bryter vid tecknet '*'
        // userInput.useDelimiter("[*\\s]+"); // Bryter vid '*' eller '\\s' = whitespace
        // (+ visar att det är mer än en delimiter angiven)

        // // Program example:
        // Task 3.1
        // // respresenting persons birthday
        // int day, month, year;

        // // creating scanner object for reading from input stream
        // Scanner userInput = new Scanner(System.in);

        // // set delimiter to '_' or '/' or whitespace
        // userInput.useDelimiter("[-/\\s]+");

        // // instructions to the user
        // System.out.print("Ditt personnummer (dd/mm-åååå): ");

        // // input
        // day = userInput.nextInt();
        // month = userInput.nextInt();
        // year = userInput.nextInt();

        // // print the result
        // System.out.println(year + "" + month + "" + day + "-xxxx");

        // Scanner userInput = new Scanner(System.in);
        // userInput.useDelimiter("[:|/|\\s]+");
        // System.out.println("Enter the path: ");
        // System.out.println(userInput.next());
        // System.out.println(userInput.next());
        // System.out.println(userInput.next());
        // System.out.println(userInput.next());
        // System.out.println(userInput.next());

        // Task 3.2
        // int age;
        // String name;

        // Scanner userInput = new Scanner(System.in);

        // System.out.print("How old are you?: ");
        // age = userInput.nextInt();
        // // String x = userInput.nextLine();

        // System.out.print("What is your name?: ");
        // name = userInput.nextLine();

        // System.out.println("Your name is " + name + " and you are " + age + " years
        // old");
        // userInput.close();

        // Task 3.3
        // Declaration and initialization of characters
        // char firstChar = 'A', secondChar = 'n',
        // thirdChar = 'n', fourthChar = 'a';

        // char firstChar = '\u0061', secondChar = '\u006E', thirdChar = 110, fourthChar
        // = 97;
        // // Print concatenated string
        // System.out.println("Den sammanslagna strängen blir : "
        // + firstChar + secondChar + thirdChar + fourthChar);

        // Validation

        // Scanner input = new Scanner(System.in);

        // while (true) {
        // System.out.print("Enter a number:");

        // if (input.hasNextInt()) {
        // System.out.println("hasNextInt");
        // }
        // if (input.hasNextFloat()) {
        // System.out.println("hasNextFloat");
        // }
        // if (input.hasNext()) {
        // System.out.println("hasNext (string)");
        // }
        // input.nextLine();
        // input.close();
        // }

        // Lecture
        // System.out.println("Enter something ");
        // Scanner userInput = new Scanner(System.in);
        // int x = 0;
        // String str = userInput.next();
        // System.out.println("You entered " + str);
        // userInput.close();
        // int height = 0;
        // height = userInput.nextInt();
        // System.out.println("You entered " + height);

        // while (true) {
        // System.out.print("\nEnter a number:");

        // if (userInput.hasNextInt()) {
        // System.out.println("hasNextInt");
        // }
        // if (userInput.hasNextFloat()) {
        // System.out.println("hasNextFloat");
        // }
        // if (userInput.hasNext()) {
        // System.out.println("hasNextString");
        // }
        // userInput.nextLine();

        // userInput.close();
        // }

    }
}
