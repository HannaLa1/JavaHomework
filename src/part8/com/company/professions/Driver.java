package part8.com.company.professions;

public class Driver extends Person{
    protected int еxperience;

    public Driver(int age, String fullName, int еxperience) {
        super(age, fullName);
        this.еxperience = еxperience;
    }

    public int getЕxperience() {
        return еxperience;
    }

    public void setЕxperience(int еxperience) {
        this.еxperience = еxperience;
    }

    @Override
    public String toString()
    {
        return  "\nИнформация о водителе -->" +
                "\nВозраст: " + getAge() +
                "\nФИО: " + getFullName() +
                "\nCтаж вождения: " + еxperience;
    }
}
