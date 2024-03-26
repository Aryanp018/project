//Concrete Prototype class for Harrier
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