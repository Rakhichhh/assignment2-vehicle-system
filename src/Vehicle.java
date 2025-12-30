public abstract class Vehicle {

    protected String brand;
    protected int year;
    protected Driver driver;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public abstract void startEngine();
    public abstract void stopEngine();

    public void displayInfo() {
        System.out.println("Vehicle: " + brand + ", year: " + year);
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }
}
