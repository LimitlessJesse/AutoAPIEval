import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPElementFactory;

public class SOAPElementFactory_1 {
    public static void main(String[] args) {
        SOAPElementFactory factory = SOAPElementFactory.newInstance();
        SOAPElement element = factory.create("localName");
        System.out.println(element);
    }
}
