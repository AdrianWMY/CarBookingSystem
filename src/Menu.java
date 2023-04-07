import java.util.Scanner;

public class Menu {

    private Scanner scanner;
    private MiRidesApplication miRidesApp;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
        this.miRidesApp = new MiRidesApplication();
    }

    public void run() {
        while (true) {
            printMenu();
            String input = scanner.nextLine();
            switch (input.toUpperCase()) {
                case "CC":
                    createCar();
                    break;
                case "BC":
                    break;
                case "CB":
                    break;
                case "DA":
                    break;
                case "SS":
                    break;
                case "SA":
                    break;
                case "SD":
                    break;
                case "EX":
                    System.out.println("See you next time");
                    System.exit(1);
                default:
                    System.out.println("Your input is not valid");

            }
        }
    }

    public void printMenu() {
        System.out.println("*** MiRides system Menu ***\n");

        System.out.println("Create Car                CC");
        System.out.println("Book Car                  BC");
        System.out.println("Complete Booking          CB");
        System.out.println("Display All Cars          DA");
        System.out.println("Search Specific Car       SS");
        System.out.println("Search Available Cars     SA");
        System.out.println("Seed Data                 SD");
        System.out.println("Exit Program              EX");
    }

    public void createCar() {
        String regNo;
        String make;
        String model;
        String driverName;
        int passengerCapacity;
        System.out.println("Enter Registration No:");
        regNo = scanner.nextLine();
        System.out.println("Enter Make:");
        make = scanner.nextLine();
        System.out.println("Enter Model:");
        model = scanner.nextLine();
        System.out.println("Enter Driver's Name:");
        driverName = scanner.nextLine();
        System.out.println("Enter Passenger Capacity:");
        passengerCapacity = Integer.parseInt(scanner.nextLine());
        System.out.println(miRidesApp.createCar(new Car(regNo, make, model, driverName, passengerCapacity)));

    }

    public void bookCar() {

    }

    public void CompleteBooking() {

    }

    public void displayAllCar() {

    }

    public void searchCars() {

    }

    public void seedData() {

    }
}
