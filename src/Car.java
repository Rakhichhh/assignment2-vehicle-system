public class Car extends Vehicle {

    private int doors;
    private String fuelType;

    public Car(String brand, int year, int doors, String fuelType) {
        super(brand, year);
        this.doors = doors;
        this.fuelType = fuelType;
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started: " + brand);
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped: " + brand);
    }
}
