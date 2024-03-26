// The following is the concrete protype for the Altroz car model.
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