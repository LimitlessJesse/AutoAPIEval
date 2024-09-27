import org.xml.sax.helpers.LocatorImpl;

public class LocatorImpl_2 {
    public static void main(String[] args) {
        LocatorImpl locator = new LocatorImpl();
        locator.setColumnNumber(10);
        int columnNumber = locator.getColumnNumber();
        System.out.println("Column Number: " + columnNumber);
    }
}
