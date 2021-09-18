package Unit17.task1;
import javax.xml.bind.annotation.*;

@XmlType(propOrder = {"name", "age", "working"}, name = "person")
public class Person {
    private String name;
    private String characterDescription;
    private int age;
    private String working;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacterDescription() {
        return characterDescription;
    }

    @XmlAttribute
    public void setCharacterDescription(String characterDescription) {
        this.characterDescription = characterDescription;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWorking() {
        return working;
    }

    public void setWorking(String working) {
        this.working = working;
    }

    @Override
    public String toString() {
        return "\nxml.Person -->" +
                "\nname: " + name +
                "\ncharacterDescription: " + characterDescription +
                "\nage: " + age +
                "\nworking: " + working +
                "\n-------------------";
    }
}
