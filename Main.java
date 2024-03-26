import java.util.Scanner;

// Main class to run the program
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner scanner = new Scanner(System.in);//implementing scanner class so we can take input fom user
        VehicleBuilder builder = new VehicleBuilder();
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        // Selecting Tata car model from the four predefined models
        // we can add new models as we like
        System.out.println("Select Tata car model (Altroz/Nexon/Tiago/Harrier):");
        String model = scanner.nextLine();

        // Taking the configurations ad input from users
        System.out.println("Enter trim (Base/Plus/Premium/Premium Plus):");
        String trim = scanner.nextLine();
        System.out.println("Enter paint (White/Black/Silver/Nardo Grey):");
        String paint = scanner.nextLine();
        System.out.println("Enter wheels (Standard/Alloy/Sport/Steel):");
        String wheels = scanner.nextLine();

        // Creating a car using builder pattern
        builder.constructVehicle(model, trim, paint, wheels);

        scanner.close();
    }
}
