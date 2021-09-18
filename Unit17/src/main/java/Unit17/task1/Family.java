package Unit17.task1;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlType(propOrder = {"nameOfFamily", "members"}, name = "family")
@XmlRootElement
public class Family {
    private String nameOfFamily;
    private List<Person> members = new ArrayList<>();

    public String getNameOfFamily() {
        return nameOfFamily;
    }

    public void setNameOfFamily(String nameOfFamily) {
        this.nameOfFamily = nameOfFamily;
    }

    @XmlElementWrapper(name = "members")
    @XmlElement(name = "person")
    public List<Person> getMembers() {
        return members;
    }

    public void setMembers(List<Person> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "xml.Family -->" +
                "\nnameOfFamily: " + nameOfFamily +
                "\n***********************************" +
                "\nmembers: " + members;
    }
}
