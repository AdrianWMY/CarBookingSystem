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

}
