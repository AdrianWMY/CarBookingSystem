import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();

        Car car = new Car("112312", "BMW", "m4", "Adrian", 2);
        System.out.println(car.toString());

        // while (true) {
        // menu.printMenu();
        // String input = scanner.nextLine();
        // switch (input.toUpperCase()) {
        // case "CC":
        // System.out.println("create car");
        // break;
        // case "BC":
        // break;
        // case "CB":
        // break;
        // case "DA":
        // break;
        // case "SS":
        // break;
        // case "SA":
        // break;
        // case "SD":
        // break;
        // case "EX":
        // System.out.println("see you next time");
        // System.exit(1);
        // default:
        // System.out.println("Your input is not valid");

        // }
        // scanner.close();

        // }

    }
}
