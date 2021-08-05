package part8.ex1;

public class Worker {
    private String name;
    private String surname;
    private double rate;
    private int days;

    public Worker(String name, String surname, double rate, int days) {
        this.name = name;
        this.surname = surname;
        this.rate = rate;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getRate() {
        return rate;
    }

    public int getDays() {
        return days;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void getSalary()
    {
        System.out.println("Зарплата работника --> " + (rate * days));
    }
}
