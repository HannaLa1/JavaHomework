package part8.com.company.details;

public class Engine {
    protected double power;
    protected String company;

    public Engine(double power, String company) {
        this.power = power;
        this.company = company;
    }

    public double getPower() {
        return power;
    }

    public String getCompany() {
        return company;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString()
    {
        return  "\nИнформация о моторе -->" +
                "\nМощность: " + power +
                "\nПроизводитель: " + company;
    }
}
