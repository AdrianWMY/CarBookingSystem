public class Car {
    private String regNo;
    private String make;
    private String model;
    private String driverName;
    private int passengerCapacity;
    private boolean available;

    public Car(String regNo, String make, String model, String driverName, int passengerCapacity) {
        this.regNo = regNo;
        this.make = make;
        this.model = model;
        this.driverName = driverName;
        this.passengerCapacity = passengerCapacity;
    }

    public String getMake() {
        return this.make;
    }
}
