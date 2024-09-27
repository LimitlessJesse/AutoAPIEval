import org.xml.sax.Locator;
import org.xml.sax.helpers.LocatorImpl;

public class LocatorImpl_3 {
    public static void main(String[] args) {
        Locator locator = new LocatorImpl();
        String publicId = locator.getPublicId();
        System.out.println("Public ID: " + publicId);
    }
}
