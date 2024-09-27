import javax.xml.bind.helpers.ValidationEventLocatorImpl;

public class ValidationEventLocatorImpl_2 {
    public static void main(String[] args) {
        ValidationEventLocatorImpl locator = new ValidationEventLocatorImpl();
        int lineNumber = locator.getLineNumber();
        System.out.println("Line number: " + lineNumber);
    }
}
