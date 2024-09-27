import org.xml.sax.Locator;
import org.xml.sax.helpers.LocatorImpl;

public class LocatorImpl_1 {
    public static void main(String[] args) {
        LocatorImpl locator = new LocatorImpl();
        locator.setColumnNumber(5);
        int columnNumber = locator.getColumnNumber();
        System.out.println("Column Number: " + columnNumber);
    }
}
