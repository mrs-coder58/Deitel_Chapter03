package chapter03;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee employee1 = new Employee("John","Duran",1000);
        Employee employee2 = new Employee("Amara","Diouf",500);

        System.out.println("Monthly salary of " + employee1.getFirstName() + ": " + employee1.getMonthlySalary() + "$");
        System.out.println("Monthly salary of " + employee2.getFirstName() + ": " + employee2.getMonthlySalary() + "$");

        System.out.println("Yearly salary of " + employee1.getFirstName() + ": " + employee1.yearlySalary() + "$");
        System.out.println("Yearly salary of " + employee2.getFirstName() + ": " + employee2.yearlySalary() + "$");

        System.out.println(employee1.increasedYearlySalary(10));
        System.out.println(employee2.increasedYearlySalary(10));

        System.out.println("Monthly salary of " + employee1.getFirstName() + " after raise: " + employee1.getMonthlySalary() + "$");
        System.out.println("Monthly salary of " + employee2.getFirstName() + " after raise: " + employee2.getMonthlySalary() + "$");

        System.out.println("Yearly salary of " + employee1.getFirstName() + " after raise: " + employee1.yearlySalary() + "$");
        System.out.println("Yearly salary of " + employee2.getFirstName() + " after raise: " + employee2.yearlySalary() + "$");

        System.out.println("Please enter the raise percent: ");
        double percent = scanner.nextDouble();
        System.out.println(employee1.increasedYearlySalary(percent));
    }
}
