// Kristina Palmquist - kirpal-7

import java.util.Scanner;

public class MarkedAssignment2 {
    public static void main(String[] args) {

        // step 1: Declaration of constants
        int NUM_OF_PANELS = 26;
        int PANEL_HEIGHT = 1; // meters
        double PANEL_WIDTH = 1.7; // meters
        double PANEL_AREA = PANEL_WIDTH * PANEL_HEIGHT;
        int SOLAR_RADIATION = 166; // Wh/m2/hour
        double EFFICIENCY = 0.2; // 20% of solar radiation
        double ELECTRIC_PRICE = 0.9; // per kWh
        int DAYS_IN_JUNE_MAX = 30;
        int DAYS_IN_JULY_MAX = 31;

        // Step 2: Declaraion of variables
        int sunriseHour;
        double sunriseMinute;
        double timeSunrise;
        int sunsetHour;
        double sunsetMinute;
        double timeSunset;
        double amountHours;
        int day;
        int month;

        // Step 3: Ask user for month and date
        // Use the correct delimiter
        // Validate (month and day)
        Scanner userInput = new Scanner(System.in);
        userInput.useDelimiter("[/|\\s|m|d|-]+");

        System.out.println("For June/July: Enter month and date (mm-dd): ");
        month = userInput.nextInt();
        day = userInput.nextInt();

        if (month != 6 && month != 7) {
            System.out.println("Date has to be in either June or July.");
            System.exit(0);
        }
        if (month == 6) {
            if (day > DAYS_IN_JUNE_MAX || day < 0) {
                System.out.println("The month of June only has 30 days.");
                System.exit(0);
            }
        }
        if (month == 7) {
            if (day > DAYS_IN_JULY_MAX || day < 0) {
                System.out.println("The month of July only has 31 days.");
                System.exit(0);
            }
        }

        // Step 4: Ask user for sunrise
        // Use the correct delimiter
        // Validate hours and minutes
        userInput.useDelimiter("[:|\\s|h|m|/]+");
        System.out.println("Enter sunrise time in the format hh:mm");
        sunriseHour = userInput.nextInt();
        sunriseMinute = userInput.nextInt();
        timeSunrise = sunriseHour + (sunriseMinute / 60);
        if (sunriseHour > 24 && sunriseMinute > 59) {
            System.out.println("Time has to be in format hh:mm");
            System.exit(0);
        }

        // Step 5: Ask user for sunset
        // Use the correct delimiter
        // Validate hours and minutes
        userInput.useDelimiter("[:|\\s|h|m|-|/]+");
        System.out.println("Enter sunset time in the format hh:mm");
        sunsetHour = userInput.nextInt();
        sunsetMinute = userInput.nextDouble();

        timeSunset = sunsetHour + (sunsetMinute / 60);
        if (sunsetHour > 24 && sunsetMinute > 59) {
            System.out.println("Time has to be in format hh:mm");
            System.exit(0);
        }

        // Step 6: Calculate the combined hours for both sunrise and sunset
        // Validate
        amountHours = timeSunset - timeSunrise;

        if (timeSunrise > timeSunset) {
            System.out.print("Sunrise is after sunset");
            System.exit(0);
        }

        // Step 7: Calcualte production
        double production = SOLAR_RADIATION * EFFICIENCY * PANEL_AREA * amountHours *
                NUM_OF_PANELS / 1000;

        // Step 8: Calculate money
        double value = production * ELECTRIC_PRICE;

        // Step 9: Print it
        System.out.printf("Enter today's date [mm-dd]> %02d", month);
        System.out.printf("-%02d", day);
        System.out.println();

        System.out.printf("Enter the time of sunrise [hh: mm]> %02d", sunriseHour);
        System.out.printf(":%02.0f", sunriseMinute);
        System.out.println();

        System.out.printf("Enter the time of sunset [hh: mm]> %02d", sunsetHour);
        System.out.printf(":%02.0f", sunsetMinute);
        System.out.println();

        System.out.println("=====================================");
        System.out.printf("Sun hours: %.2f", amountHours);
        System.out.printf(" hours");
        System.out.println();
        System.out.printf("The production on %02d", day);
        System.out.printf("/%02d", month);
        System.out.printf(" is: %.2f", production);
        System.out.printf(" kWh to a value of: SEK %.2f", value);

        userInput.close();
    }
}
