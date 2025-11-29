package chapter03;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int birthDay;
    private int birthMonth;
    private int birthYear;

    public HeartRates(String firstName, String lastName, int birthDay, int birthMonth, int birthYear){
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthDay=birthDay;
        this.birthMonth=birthMonth;
        this.birthYear=birthYear;
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
}
