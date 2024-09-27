import javax.xml.bind.helpers.AbstractUnmarshallerImpl;

public class AbstractUnmarshallerImpl_4 {
    public static void main(String[] args) {
        AbstractUnmarshallerImpl unmarshaller = new AbstractUnmarshallerImpl();
        unmarshaller.setProperty("myProperty", "Hello, World!");
        String propertyValue = unmarshaller.getProperty("myProperty");
        System.out.println(propertyValue);
    }
}
