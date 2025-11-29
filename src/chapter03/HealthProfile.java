package chapter03;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private double heightInCentimeters;
    private double weightInKilos;

    public HealthProfile(String firstName, String lastName, String gender, int birthDay, int birthMonth, int birthYear, double heightInCentimeters, double weightInKilos){
        this.firstName=firstName;
        this.lastName=lastName;
        this.gender=gender;
        this.birthDay=birthDay;
        this.birthMonth=birthMonth;
        this.birthYear=birthYear;
        this.heightInCentimeters =heightInCentimeters;
        this.weightInKilos=weightInKilos;
    }

    public int getAge(){
        java.time.LocalDate today = java.time.LocalDate.now();
        java.time.LocalDate birthDate = java.time.LocalDate.of(birthYear,birthMonth,birthDay);
        return java.time.Period.between(birthDate,today).getYears();
    }
    public int getMaximumHeartRate(){
        return 220 - getAge();
    }
    public String getTargetHeartRateRange(){
        double max = getMaximumHeartRate();
        double lower = max * 0.50;
        double upper = max * 0.85;
        return String.format("%.1f - %.1f bpm", lower, upper);
    }
    public double getBMI(){
        double heightInMeters = this.heightInCentimeters / Math.pow(10,2);
        return weightInKilos / Math.pow(heightInMeters,2);
    }

    public String getBMICategory(){
        double bmi = getBMI();

        if(bmi < 18.5){
            return "Underweight";
        }
        else if(bmi >= 18.5 && bmi < 25){
            return "Normal";
        }
        else if(bmi >= 25 && bmi < 30){
            return "Overweight";
        }
        else{
            return "Obese";
        }
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public double getHeightInCentimeters() {
        return heightInCentimeters;
    }

    public void setHeightInCentimeters(double heightInCentimeters) {
        this.heightInCentimeters = heightInCentimeters;
    }

    public double getWeightInKilos() {
        return weightInKilos;
    }

    public void setWeightInKilos(double weightInKilos) {
        this.weightInKilos = weightInKilos;
    }
}
