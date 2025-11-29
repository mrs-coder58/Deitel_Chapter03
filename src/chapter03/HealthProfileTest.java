package chapter03;

import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your first name: ");
        String firstName = scanner.next();
        scanner.nextLine();

        System.out.print("\nPlease enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("\nPlease enter your gender: ");
        String gender = scanner.nextLine();

        System.out.print("\nPlease enterr your birth day (1-31): ");
        int birthDay = scanner.nextInt();

        System.out.print("\nPlease enter your birth month (1-12): ");
        int birthMonth = scanner.nextInt();

        System.out.print("\nPlease enter your birth year (e.g. 2002): ");
        int birthYear = scanner.nextInt();

        System.out.print("\nPlease enter your height in centimeters: ");
        int heightInMeters = scanner.nextInt();

        System.out.print("\nPlease enter your weight in kilograms: ");
        int weightInKilos = scanner.nextInt();

        HealthProfile person = new HealthProfile(firstName, lastName, gender, birthDay, birthMonth, birthYear, heightInMeters,weightInKilos);

        System.out.println(person.getAge());

        System.out.println(person.getMaximumHeartRate());

        System.out.println(person.getTargetHeartRateRange());

        System.out.println("BMI: " + person.getBMI() + "\nYour BMI Category: " + person.getBMICategory());
    }
}
