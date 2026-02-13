import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Currency Converter");
        System.out.println("1 - USD to TRY");
        System.out.println("2 - EUR to TRY");

        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        double result = 0;

        if (choice == 1) {
            result = amount * 30.0;
            System.out.println("Converted amount: " + result + " TRY");
        }
        else if (choice == 2) {
            result = amount * 33.0;
            System.out.println("Converted amount: " + result + " TRY");
        }
        else {
            System.out.println("Invalid option!");
        }

        scanner.close();
    }
}
