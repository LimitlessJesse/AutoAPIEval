import org.xml.sax.Locator;
import org.xml.sax.helpers.LocatorImpl;

public class LocatorImpl_4 {
    public static void main(String[] args) {
        Locator locator = new LocatorImpl();
        String systemId = locator.getSystemId();
        System.out.println("System Identifier: " + systemId);
    }
}
