import javax.xml.bind.helpers.AbstractMarshallerImpl;

public class AbstractMarshallerImpl_2 {
    public static void main(String[] args) {
        AbstractMarshallerImpl marshaller = new AbstractMarshallerImpl();
        marshaller.setProperty("myProperty", "Hello, World!");
        String value = marshaller.getProperty("myProperty");
        System.out.println(value);  // Outputs: Hello, World
    }
}
