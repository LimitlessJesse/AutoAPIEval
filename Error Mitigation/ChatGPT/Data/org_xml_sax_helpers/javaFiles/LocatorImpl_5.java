import org.xml.sax.helpers.LocatorImpl;

public class LocatorImpl_5 {
    public static void main(String[] args) {
        LocatorImpl locator = new LocatorImpl();
        locator.setColumnNumber(5);
        System.out.println("Column number set to: " + locator.getColumnNumber());
    }
}
