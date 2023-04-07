
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

    public void bookCar() {

    }

    public Car[] getCars() {
        return this.cars;
    }
}
