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

    public boolean book(String firstName, String lastName, DateTime required, int numPassengers) {

        return false;
    }

    public String getDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-15s %s\n", "RegNo:", this.regNo));
        sb.append(String.format("%-15s %s\n", "Make & Model:", this.make + " " + this.model));
        sb.append(String.format("%-15s %s\n", "Driver Name:", this.driverName));
        sb.append(String.format("%-15s %s\n", "Capacity:", this.passengerCapacity));
        sb.append(String.format("%-15s %s\n", "Available:", this.available));

        return sb.toString();
    }

    @Override
    public String toString() {
        return regNo + ":" + make + ":" + model + ":" + driverName
                + ":" + passengerCapacity + ":" + (available && true ? "YES" : "NO");
    }
}
