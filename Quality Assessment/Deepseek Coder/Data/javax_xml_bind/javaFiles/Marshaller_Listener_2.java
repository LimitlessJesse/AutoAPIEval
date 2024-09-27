import javax.xml.bind.*;
import java.util.Date;

public class Marshaller_Listener_2 {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance(Date.class);
        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        // Create a listener
        Marshaller.Listener listener = new Marshaller.Listener() {
            @Override
            public void afterMarshal(Object source) {
                System.out.println("After marshalling: " + source);
            }
        };

        // Add the listener to the marshaller
        marshaller.addEventListener(listener);

        // Create an object to be marshalled
        Date date = new Date();

        // Marshal the object
        marshaller.marshal(date, System.out);
    }
}
