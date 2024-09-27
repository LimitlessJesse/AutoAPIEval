import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class JAXBContext_1 {
    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance(MyClass.class);
            System.out.println("JAXBContext created successfully");
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    static class MyClass {
        // Define your class here
    }
}
