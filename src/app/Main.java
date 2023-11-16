package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    static double rate;
    static double income;
    static double lowIncome;
    static double highIncome;
    static double fee;
    private final static String CURRENCY = "USD";
    static Scanner scanner;

    public static void main(String[] args) {

        lowIncome = 10000;
        highIncome = 25000;


        scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.print("Input your income in USD, please: ");
        income = scanner.nextDouble();

        if (income > 0 & income <= lowIncome) {
            rate = 2.5 / 100;

        } else if (income > lowIncome & income <= highIncome) {
            rate = 4.3 / 100;

        } else if (income > highIncome) {
            rate = 6.7 / 100;

            //это на случай если отрицательное число введут:
        } else {
            System.out.println("Try again, please");
        }
        fee = rate * income;

        System.out.printf("%n Your fee is %.2f %s",
                fee, CURRENCY);

        scanner.close();
    }
}


