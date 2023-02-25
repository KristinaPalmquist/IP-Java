// Kristina Palmquist - kirpal-7
public class Main {
    public static void main(String[] args) {

        // declaring & initiating variables for given data
        final double batteryCapacity = 35.8;
        final double currentTen = 10.0;
        final double currentSixteen = 16.0;
        final double currentThirtyTwo = 32.0;
        final double voltage230 = 230.0;
        final double voltage400 = 400.0;

        final double squareRoot3 = Math.sqrt(3);

        // calculations of charging power (divide by 1000 to get kW in stead of W)
        final double chargingPowerSingle10kWRound = Math.round((currentTen * voltage230 / 1000) * 100.0) / 100.0;
        final double chargingPowerSingle16kWRound = Math.round((currentSixteen * voltage230 / 1000) * 100.0) / 100.0;
        final double chargingPowerThree10kWRound = Math.round((currentTen * voltage400 * squareRoot3 / 1000) * 100.0)
                / 100.0;
        final double chargingPowerThree16kWRound = Math
                .round((currentSixteen * voltage400 * squareRoot3 / 1000) * 100.0)
                / 100.0;
        final double chargingPowerThree32kWRound = Math
                .round((currentThirtyTwo * voltage400 * squareRoot3 / 1000) * 100.0)
                / 100.0;

        // calculations of charging time
        final double chargingTimeSingle10kWRound = Math.round(batteryCapacity / chargingPowerSingle10kWRound * 100.00)
                / 100.00;
        final double chargingTimeSingle16kWRound = Math.round(batteryCapacity / chargingPowerSingle16kWRound * 100.00)
                / 100.00;
        final double chargingTimeThree10kWRound = Math.round(batteryCapacity / chargingPowerThree10kWRound * 100.00)
                / 100.00;
        final double chargingTimeThree16kWRound = Math.round(batteryCapacity / chargingPowerThree16kWRound * 100.00)
                / 100.00;
        final double chargingTimeThree32kWRound = Math.round(batteryCapacity / chargingPowerThree32kWRound * 100.00)
                / 100.00;

        // printing table
        System.out.println("Battery: " + batteryCapacity + " (kWh)");
        // table headers
        System.out.printf("%-10s %-10s %-20s %-20s %n",
                "Current(A)", "Voltage(V)", "Charging Power(kW)", "Charging Time(h)");
        // data for each instance
        System.out.printf("%10.1f %10.1f %17.2f %17.2f %n",
                currentTen, voltage230, chargingPowerSingle10kWRound, chargingTimeSingle10kWRound);
        System.out.printf("%10.1f %10.1f %17.2f %17.2f %n",
                currentSixteen, voltage230, chargingPowerSingle16kWRound, chargingTimeSingle16kWRound);
        System.out.printf("%10.1f %10.1f %17.2f %17.2f %n",
                currentTen, voltage400, chargingPowerThree10kWRound, chargingTimeThree10kWRound);
        System.out.printf("%10.1f %10.1f %17.2f %17.2f %n",
                currentSixteen, voltage400, chargingPowerThree16kWRound, chargingTimeThree16kWRound);
        System.out.printf("%10.1f %10.1f %17.2f %17.2f %n",
                currentThirtyTwo, voltage400, chargingPowerThree32kWRound, chargingTimeThree32kWRound);
    }
}
