import javax.xml.bind.helpers.ValidationEventLocatorImpl;

public class ValidationEventLocatorImpl_2 {
    public static void main(String[] args) {
        ValidationEventLocatorImpl locator = new ValidationEventLocatorImpl();
        locator.setLineNumber(10);
        System.out.println(locator.getLineNumber());
    }
}
