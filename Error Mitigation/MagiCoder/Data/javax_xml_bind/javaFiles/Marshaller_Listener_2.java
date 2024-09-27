import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class Marshaller_Listener_2 {
    public static void main(String[] args) {
        try {
            JAXBContext jc = JAXBContext.newInstance(MyClass.class);
            Marshaller marshaller = jc.createMarshaller();
            marshaller.setListener(new MyListener());

            MyClass myClass = new MyClass();
            StringWriter sw = new StringWriter();
            marshaller.marshal(myClass, sw);

            System.out.println(sw.toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

class MyClass {
    // Your JAXB annotated class
}

class MyListener implements Marshaller.Listener {
    @Override
    public void afterMarshal(Object source) {
        System.out.println("After marshal: " + source);
    }
}
