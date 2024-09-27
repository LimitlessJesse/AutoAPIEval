import javax.xml.bind.helpers.ValidationEventImpl;

public class ValidationEventImpl_3 {
    public static void main(String[] args) {
        ValidationEventImpl event = new ValidationEventImpl(1, "Error message", null);
        String message = event.getMessage();
        System.out.println(message);
    }
}
