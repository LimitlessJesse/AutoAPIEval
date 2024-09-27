import org.xml.sax.Locator;
import org.xml.sax.helpers.LocatorImpl;

public class LocatorImpl_2 {
    public static void main(String[] args) {
        Locator locator = new LocatorImpl();
        int lineNumber = ((LocatorImpl) locator).getLineNumber();
        System.out.println("Line number: " + lineNumber);
    }
}
