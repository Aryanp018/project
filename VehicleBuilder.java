import java.util.HashMap;
import java.util.Map;
// Director for the Builder Pattern
class VehicleBuilder {
    // Map to store the prototypes of the vehicles
    private Map<String, VehiclePrototype> prototypes;

    // Constructor to initialize the prototypes
    public VehicleBuilder() {
        //HashMap is used to store the prototypes of the vehicles
        prototypes = new HashMap<>();
        prototypes.put("Altroz", new AltrozPrototype());
        prototypes.put("Nexon", new NexonPrototype());
        prototypes.put("Tiago", new TiagoPrototype());
        prototypes.put("Harrier", new HarrierPrototype());
    }

    // Constructing the vehicle using the prototype pattern
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