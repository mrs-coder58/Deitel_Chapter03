package chapter03;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary){
        this.firstName=firstName;
        this.lastName=lastName;
        if(monthlySalary > 0.0){
            this.monthlySalary=monthlySalary;
        }
    }
    public double yearlySalary(){
        return monthlySalary * 12;
    }

    public double increasedYearlySalary(double percent){
        if(percent > 0.0){
            monthlySalary *= (1 + percent / 100);
        }
        return monthlySalary;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if(monthlySalary > 0.0){
            this.monthlySalary = monthlySalary;
        }
    }
}
