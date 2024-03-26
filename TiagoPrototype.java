//Concrete Prototype class for Tiago
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