import javax.xml.bind.helpers.ValidationEventLocatorImpl;

public class ValidationEventLocatorImpl_1 {
    public static void main(String[] args) {
        ValidationEventLocatorImpl locator = new ValidationEventLocatorImpl();
        locator.setColumnNumber(10);
        System.out.println(locator.getColumnNumber());
    }
}
