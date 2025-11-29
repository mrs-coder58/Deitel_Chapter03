package chapter03;

import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name:");
        String firstName = scanner.nextLine();

        System.out.print("\nEnter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("\nEnter your birth day (1-31): ");
        int birthDay = scanner.nextInt();

        System.out.print("\nEnter your birth month (1-12): ");
        int birthMonth = scanner.nextInt();

        System.out.print("\nEnter your birth year (e.g. 2001): ");
        int birthYear = scanner.nextInt();

        HeartRates person = new HeartRates(firstName,lastName,birthDay,birthMonth,birthYear);

        System.out.println();
        System.out.println(person.getAge());
        System.out.println(person.getMaximumHeartRate());
        System.out.println(person.getTargetHeartRateRange());

    }
}
