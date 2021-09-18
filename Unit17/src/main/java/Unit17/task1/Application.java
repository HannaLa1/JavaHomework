package Unit17.task1;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {
    public Person createPerson(String name, String characterDescription, int age, String working) throws ParseException {
        Person person = new Person();
        person.setName(name);
        person.setCharacterDescription(characterDescription);
        person.setAge(age);
        person.setWorking(working);
        return person;
    }

    public Family createJavaObject(){
        Family family = new Family();
        family.setNameOfFamily("The Simpson's family");

        try {
            family.getMembers().add(createPerson("Homer", "The head of the family",36,
                    "Safety Inspector at the Springfield Nuclear Power Plant"));
            family.getMembers().add(createPerson("Marge", "Homer's wife and mother of three children",
                    34, "No"));
            family.getMembers().add(createPerson("Bart", "The eldest of the children",
                    10, "No"));
            family.getMembers().add(createPerson("Liza", "The average of the children",
                    8, "No"));
            family.getMembers().add(createPerson("Maggie", "The youngest of the children",
                    1, "No"));
        } catch (ParseException exception){
            Logger.getLogger(Application.class.getName()).
                    log(Level.ALL,"createJavaObject threw ParseException", exception);
        }
        return family;
    }

    public void marshallExample() {
        try {
            File file = new File("Unit17/src/main/java/Unit17/task1/result.xml");
            JAXBContext context = JAXBContext.newInstance(Family.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(createJavaObject(), file);
        }catch (JAXBException exception){
            Logger.getLogger(Application.class.getName()).
                    log(Level.SEVERE, "marshallExample threw JAXBException", exception);
        }
    }

    public void unMarshallExample(){
        try {
            File file = new File("Unit17/src/main/java/Unit17/task1/result.xml");
            JAXBContext context = JAXBContext.newInstance(Family.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Family unmarshal = (Family) unmarshaller.unmarshal(file);
            System.out.println(unmarshal);
        } catch (JAXBException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.marshallExample();
        application.unMarshallExample();
    }
}
