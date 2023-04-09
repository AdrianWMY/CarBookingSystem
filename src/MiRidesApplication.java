import java.io.DataInput;

public class MiRidesApplication {

    private Car[] cars;

    public MiRidesApplication() {
        this.cars = new Car[0];
    }

    public String createCar(Car car) {

        addCar(car);
        return "New Car added successfully for registion number: " + car.getRegNo();
    }

    /*
     * This is a dynamic array for adding new car to the array
     */
    public void addCar(Car car) {
        Car[] newCars = new Car[cars.length + 1];

        for (int i = 0; i < cars.length; i++) {
            newCars[i] = cars[i];
        }
        newCars[newCars.length - 1] = car;
        this.cars = newCars;
    }

    public String bookCar(String date) {

        String result = "";
        if (!date.contains("/")) {
            result = "Your input is not vaild";
        } else {

            String[] dateArray = date.split("/");
            DateTime dateTime = new DateTime(Integer.parseInt(dateArray[0]), Integer.parseInt(dateArray[1]),
                    Integer.parseInt(dateArray[2]));
            DateTime currenDateTime = new DateTime();
            if (DateTime.diffDays(dateTime, currenDateTime) >= 0) {
                result = "The following cars are available : \n";
                for (int i = 0; i < cars.length; i++) {
                    result += i + 1 + ". " + cars[i].getRegNo() + "\n";
                }
            } else {
                result = "No cars available";
            }

        }

        // if (dateTime.) {
        // result = "Error - No cars are available on this date";
        // } else {
        // result = "Error - No cars are available on this date";
        // }

        return result;

    }

    public Car[] getCars() {
        return this.cars;
    }
}
