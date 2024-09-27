import javax.xml.bind.Marshaller;
import javax.xml.bind.helpers.AbstractMarshallerImpl;

public class AbstractMarshallerImpl_1 {
    public static void main(String[] args) {
        AbstractMarshallerImpl marshaller = new AbstractMarshallerImpl();
        try {
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
