import javax.xml.bind.*;
import java.util.ArrayList;

public class Marshaller_Listener_1 {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance(ArrayList.class);
        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        Marshaller.Listener listener = new Marshaller.Listener() {
            @Override
            public void beforeMarshal(Object source) {
                if (source instanceof ArrayList) {
                    ArrayList list = (ArrayList) source;
                    System.out.println("Before marshalling: " + list);
                }
            }
        };

        marshaller.setListener(listener);
        marshaller.marshal(list, System.out);
    }
}
