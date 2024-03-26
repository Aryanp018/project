// Concrete prototype class for Nexon
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
