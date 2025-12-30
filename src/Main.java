public class Main {
    public static void main(String[] args) {

        Driver d1 = new Driver("Alex", "KZ12345");
        Driver d2 = new Driver("Dana", "KZ98765");

        Car car = new Car("Toyota", 2020, 4, "Gasoline");
        Motorcycle moto = new Motorcycle("Yamaha", 2018, false);
        Truck truck = new Truck("Volvo", 2015, 12.5, 6);

        car.setDriver(d1);
        moto.setDriver(d1);
        truck.setDriver(d2);

        Vehicle[] vehicles = { car, moto, truck };

        for (Vehicle v : vehicles) {
            v.startEngine();
            v.displayInfo();
            v.stopEngine();

            if (v.getDriver() != null) {
                v.getDriver().displayDriverInfo();
            }

            System.out.println("--------------------");
        }
    }
}
