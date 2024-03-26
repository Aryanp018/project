//This abstract class is used to create a prototype of the vehicle
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