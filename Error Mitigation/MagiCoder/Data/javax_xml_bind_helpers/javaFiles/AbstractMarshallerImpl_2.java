import javax.xml.bind.helpers.AbstractMarshallerImpl;

public class AbstractMarshallerImpl_2 {
    public static void main(String[] args) {
        AbstractMarshallerImpl marshaller = new AbstractMarshallerImpl();
        try {
            Object property = marshaller.getProperty("propertyName");
            System.out.println(property);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
