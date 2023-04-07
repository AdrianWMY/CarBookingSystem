public class Booking {
    private String id;
    private double bookingFee;
    private DateTime pickUpDateTime;
    private String firstName;
    private String lastName;
    private int numPassengers;
    private double kilometersTravelled;
    private double tripFee;
    private Car car;

    public Booking(String firstName, String lastName, DateTime required,
            int numPassengers, Car car) {

    }

    public String getId() {
        return id;
    }

    public double getBookingFee() {
        return bookingFee;
    }

    public DateTime getPickUpDateTime() {
        return pickUpDateTime;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBookingFee(double bookingFee) {
        this.bookingFee = bookingFee;
    }

    public void setPickUpDateTime(DateTime pickUpDateTime) {
        this.pickUpDateTime = pickUpDateTime;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    public void setKilometersTravelled(double kilometersTravelled) {
        this.kilometersTravelled = kilometersTravelled;
    }

    public void setTripFee(double tripFee) {
        this.tripFee = tripFee;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public double getKilometersTravelled() {
        return kilometersTravelled;
    }

    public double getTripFee() {
        return tripFee;
    }

    public Car getCar() {
        return car;
    }

    public String getDetials() {

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-15s %s\n", "id:", this.id));
        sb.append(String.format("%-15s %s\n", "Booking Fee:", this.bookingFee));
        sb.append(String.format("%-15s %s\n", "Pick Up Date:", this.pickUpDateTime));
        sb.append(String.format("%-15s %s\n", "Name:", this.firstName + " " + this.lastName));
        sb.append(String.format("%-15s %s\n", "Passengers:", this.numPassengers));
        sb.append(String.format("%-15s %s\n", "Travelled:", this.kilometersTravelled));
        sb.append(String.format("%-15s %s\n", "Trip Fee:", this.tripFee));
        sb.append(String.format("%-15s %s\n", "Car Id:", this.car.getRegNo()));

        return sb.toString();
    }

}
