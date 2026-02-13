import java.util.Scanner;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;

 public class Main {
    //public static double getLiveRate(String currency) {
        //if (currency.equals("USD")) return 44.0;
        //if (currency.equals("EUR")) return 52.0;
        //return 1.0;
    //}
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
            result = amount * 44.0;
            System.out.println("Converted amount: " + result + " TRY");
        }
        else if (choice == 2) {
            result = amount * 52.0;
            System.out.println("Converted amount: " + result + " TRY");
        }
        else {
            System.out.println("Invalid option!");
        }

        scanner.close();
    }
}
