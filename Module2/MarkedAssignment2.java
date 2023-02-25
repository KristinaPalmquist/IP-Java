// // Kristina Palmquist - kirpal-7
// package Module2;
// import java.util.Scanner;

// public class MarkedAssignment2 {
//     public static void main(String[] args) {
//         System.out.println("Hello world!");

//         /* The two main math equations are
//           * 1) production (in kWh) = SOLAR_RADIATION * EFFICIENCY * PANEL_AREA * hours * NUM_OF_PANELS / 1000; //Note the equation in instruction is in Wh, so we divide by 1000 to get kWh as price is per kWh
//             2) value = production * ELECTRIC_PRICe
//             where,
//             NUM_OF_PANELS = 26;
//             PANEL_HEIGHT = 1; //Units is meters, so no conversion is needed as SOLAR_RADIATION is per m^2
//             SOLAR_RADIATION = 166; //this is in Wh units, hence divide by 1000 in eq 1 above to convert to kWh
//             PANEL_WIDTH = 1.7; //Units is meters, so no conversion is needed as SOLAR_RADIATION is per m^2
//             PANEL_AREA = PANEL_WIDTH * PANEL_HEIGHT;
//             EFFICIENCY = 0.2; //(instruction says 20 percent efficiency, so, 20/100 = 0.2)
//             ELECTRIC_PRICE = 0.9; //this is per kWh, so we calculate production in kWh in eq 1
//             DAYS_IN_JUNE_MAX = 30;

//           */

//         //step 1: Declare Constants
//         int NUM_OF_PANELS = 26;
//         int PANEL_HEIGHT = 1; // meters
//         int SOLAR_RADIATION = 166; // Wh
//         double PANEL_WIDTH = 1.7; // meters
//         double PANEL_AREA = PANEL_WIDTH * PANEL_HEIGHT;
//         double EFFICIENCY = 0.2;
//         double ELECTRIC_PRICE = 0.9; //per kWh
//         int DAYS_IN_JUNE_MAX = 30;
//         double production = SOLAR_RADIATION * EFFICIENCY * PANEL_AREA * hours * NUM_OF_PANELS / 1000;
//         double value = production * ELECTRIC_PRICE;


//         //Step 2: Variables
//         //hour, minutes, month, day
//         int hour;
//         int minutes;
//         int month;
//         int day;


//         //Step 3: Ask user for month and date
//         //Use the correct delimiter
//         //Validate (month and day)
//         Scanner userInput = new Scanner(System.in);
//         userInput.useDelimiter("/");
//         System.out.println("Enter month and date (mm/dd): ");
//         // String ageString = scanner.nextLine();

//         //Step 4: Ask user for sunrise
//         //Use the correct delimiter
//         //Validate hours and miniutes

//         //Step 5: same as step 4, but for sunset

//         //Step 6: Calculate the combined hours for both sunrise and sunset
//         //Validate
//         double hours = 23;
//         double minutes = 55;

//         double finalSunriseHours = 0.0;
//         finalSunriseHours = 23 + 55/60; //Convert minutes to hours

//         double finalSunsetHours = 0.0;

//         if(finalSunriseHours > finalSunsetHours) {
//           System.out.print("Sunrise is after sunset");
//         }

//         //Step 7: Calcualte production, eq 1 above

//         //Step 8: Calculate money, eq 2 above

//         //Step 9:
//         //Print it
//       }
// }
