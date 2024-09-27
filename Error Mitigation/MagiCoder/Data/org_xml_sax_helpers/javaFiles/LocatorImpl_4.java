import org.xml.sax.helpers.LocatorImpl;

public class LocatorImpl_4 {
    public static void main(String[] args) {
        LocatorImpl locator = new LocatorImpl();
        locator.setSystemId("http://example.com");
        System.out.println(locator.getSystemId());
    }
}
