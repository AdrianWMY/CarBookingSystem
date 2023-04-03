import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();

        while (true) {
            menu.printMenu();
            String input = scanner.nextLine();
            switch (input.toUpperCase()) {
                case "CC":
                    System.out.println("create car");
                    break;
                case "BC":
                    break;
                case "EX":
                    System.out.println("see you next time");
                    System.exit(1);
                default:
                    System.out.println("Your input is not valid");

            }

        }

    }
}
