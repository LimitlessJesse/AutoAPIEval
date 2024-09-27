import javax.xml.bind.helpers.ValidationEventImpl;

public class ValidationEventImpl_1 {
    public static void main(String[] args) {
        ValidationEventImpl event = new ValidationEventImpl(null, "This is a test message.");
        System.out.println(event.getMessage());
    }
}
