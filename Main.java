import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// First of all we will create a Prototype Pattern
abstract class VehiclePrototype implements Cloneable {
    protected String trim;
    protected String paint;
    protected String wheels;

    public abstract void displaySpecifications();

    @Override
    //sometimes a error occurs for using a clone, so to tackle i have thrown a exception which will handle the error
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

// The following is the concrete protypes which will create 4 diff car models of TATA
class AltrozPrototype extends VehiclePrototype {
    public AltrozPrototype() {
        this.trim = "Base";
        this.paint = "White";
        this.wheels = "Standard";
    }

    @Override
    public void displaySpecifications() {
        System.out.println("Altroz Specifications:");
        System.out.println("Trim: " + trim);
        System.out.println("Paint: " + paint);
        System.out.println("Wheels: " + wheels);
    }
}

class NexonPrototype extends VehiclePrototype {
    public NexonPrototype() {
        this.trim = "Base";
        this.paint = "White";
        this.wheels = "Standard";
    }

    @Override
    public void displaySpecifications() {
        System.out.println("Nexon Specifications:");
        System.out.println("Trim: " + trim);
        System.out.println("Paint: " + paint);
        System.out.println("Wheels: " + wheels);
    }
}

class TiagoPrototype extends VehiclePrototype {
    public TiagoPrototype() {
        this.trim = "Base";
        this.paint = "White";
        this.wheels = "Standard";
    }

    @Override
    public void displaySpecifications() {
        System.out.println("Tiago Specifications:");
        System.out.println("Trim: " + trim);
        System.out.println("Paint: " + paint);
        System.out.println("Wheels: " + wheels);
    }
}

class HarrierPrototype extends VehiclePrototype{
    public HarrierPrototype() {
        this.trim = "Base";
        this.paint = "White";
        this.wheels = "Standard";
    }

    @Override
    public void displaySpecifications(){
        System.out.println("Harrier Specifications:");
        System.out.println("Trim: " + trim);
        System.out.println("Paint: " + paint);
        System.out.println("Wheels: " + wheels);
    }
}

// As per the question i have also implemented singleton pattern.
class ConfigurationManager {
    private static ConfigurationManager instance;
    private ConfigurationManager() {}

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }
}

// Director for the Builder Pattern
class VehicleBuilder {
    private Map<String, VehiclePrototype> prototypes;

    public VehicleBuilder() {
        prototypes = new HashMap<>();
        prototypes.put("Altroz", new AltrozPrototype());
        prototypes.put("Nexon", new NexonPrototype());
        prototypes.put("Tiago", new TiagoPrototype());
        prototypes.put("Harrier", new HarrierPrototype());
    }

    public void constructVehicle(String model, String trim, String paint, String wheels) throws CloneNotSupportedException {
        VehiclePrototype prototype = prototypes.get(model);
        if (prototype != null) {
            VehiclePrototype vehicle = (VehiclePrototype) prototype.clone();
            vehicle.trim = trim;
            vehicle.paint = paint;
            vehicle.wheels = wheels;
            vehicle.displaySpecifications();
        } else {
            throw new IllegalArgumentException("Invalid Tata car model: " + model);//if user enters a model which is not given in the list it will throw exception
        }
    }
}

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
        System.out.println("Enter paint (White/Black/Silver/Grey):");
        String paint = scanner.nextLine();
        System.out.println("Enter wheels (Standard/Alloy/Sport/Steel):");
        String wheels = scanner.nextLine();

        // Creating a car using builder pattern
        builder.constructVehicle(model, trim, paint, wheels);

        scanner.close();
    }
}
