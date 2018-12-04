package model;

public class Birthday {
    private int yearOfBirth;
    private int monthOfBirth;
    private int dayOfBirth;

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public Birthday(int year, int month, int day){
        this.yearOfBirth = year;
        this.monthOfBirth = month;
        this.dayOfBirth = day;
    }
}
