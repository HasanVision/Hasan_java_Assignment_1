package chapter3;

// 3.14 (Date Class) Create a class called Date that includes three instance
// variables—a month (type int), a day (type int) and a year (type int).
// Provide a constructor that initializes the three instance variables and
// assumes
// that the values provided are correct. Provide a set and a get method for each
// instance variable.
// Provide a method displayDate that displays the month, day and year separated
// by forward slashes (/).
// Write a test app named DateTest that demonstrates class Date’s capabilities.

public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // ==============================================================================>
    // Setters

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }
    // ==============================================================================>
    // Getters

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public void displayDate() {
        System.out.printf("%d/%d/%d%n", month, day, year);
    }

    // ==============================================================================>
    // Test App
    public static void main(String[] args) {

        Date date = new Date(4, 26, 2024);

        date.setMonth(4);
        date.setDay(26);
        date.setYear(2024);

        int month = date.getMonth();
        int day = date.getDay();
        int year = date.getYear();

        System.out.println("Date: " + month + "/" + day + "/" + year);
    }
}
