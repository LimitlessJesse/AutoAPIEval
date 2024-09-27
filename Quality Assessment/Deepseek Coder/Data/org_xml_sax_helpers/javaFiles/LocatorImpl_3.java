import org.xml.sax.helpers.LocatorImpl;

public class LocatorImpl_3 {
    public static void main(String[] args) {
        LocatorImpl locator = new LocatorImpl();
        locator.setPublicId("-//W3C//DTD XHTML 1.0 Strict//EN");
        System.out.println(locator.getPublicId());
    }
}
