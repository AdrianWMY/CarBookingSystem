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

    public String getRegNo() {
        return regNo;
    }

    public String getModel() {
        return model;
    }

    public String getDriverName() {
        return driverName;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
