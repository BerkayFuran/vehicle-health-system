import java.util.Scanner;

public class VehicleHealthSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Vehicle Model: ");
        String theVehicleModel = scanner.nextLine();

        System.out.print("Vehicle Year: ");
        int theVehicleYear = scanner.nextInt();

        System.out.print("Mileage: ");
        double theMileage = scanner.nextDouble();

        System.out.print("Engine Temperature: ");
        int theEngineTemperature = scanner.nextInt();

        System.out.print("Oil Level: ");
        double theOilLevel = scanner.nextDouble();

        System.out.print("Battery Voltage: ");
        double theBatteryVoltage = scanner.nextDouble();

        System.out.print("Last Service Mileage: ");
        double theLastServiceMileage = scanner.nextDouble();

        scanner.close();

        System.out.println("===== VEHICLE CHECK =====");
        System.out.println();
        System.out.println("Vehicle : " + theVehicleModel);
        System.out.println("Year    : " + theVehicleYear);
        System.out.println("Mileage : " + String.format("%.0f", theMileage) + " km");
        System.out.println();

        System.out.println("----- CAR HEALTH REPORT -----");

        boolean attentionRequired = false;

        if (theEngineTemperature < 70) {
            System.out.println("Engine Cold " + theEngineTemperature + "°C");
        } else if (theEngineTemperature <= 105) {
            System.out.println("Engine Normal " + theEngineTemperature + "°C");

        } else {
            System.out.println("Engine Temperature High " + theEngineTemperature + "°C");
            attentionRequired = true;
        }
        if (theOilLevel >= 50) {
            System.out.println("Oil Level OK " + String.format("%.0f", theOilLevel) + "%");
        } else if (theOilLevel >= 25) {
            System.out.println("Check Oil Soon " + String.format("%.0f", theOilLevel) + "%");
        } else {
            System.out.println("Warning Low Oil " + String.format("%.0f", theOilLevel) + "%");
            attentionRequired = true;
        }
        if (theBatteryVoltage >= 12.4) {
            System.out.println("Battery Good " + String.format("%.1f", theBatteryVoltage) + "V");
        } else if (theBatteryVoltage >= 12.0) {
            System.out.println("Battery Check Recommended " + String.format("%.1f", theBatteryVoltage) + "V");
        } else {
            System.out.println("Warning Battery Low " + String.format("%.1f", theBatteryVoltage) + "V");
            attentionRequired = true;
        }
        double theServiceResult = (theMileage - theLastServiceMileage);
        if (theServiceResult >= 15000) {
            System.out.println("SERVICE REQUIRED " + String.format("%.0f", theServiceResult) + " km");
            attentionRequired = true;
        } else {
            System.out.println("Service Not Required " + String.format("%.0f", theServiceResult) + " km");

        }
        if (attentionRequired) {
            System.out.println("VEHICLE STATUS: ATTENTION REQUIRED");
        } else {
            System.out.println("VEHICLE STATUS: VEHICLE HEALTHY");
        }
    }



































}
