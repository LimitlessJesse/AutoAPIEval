import javax.xml.bind.helpers.ValidationEventImpl;

public class ValidationEventImpl_2 {
    public static void main(String[] args) {
        ValidationEventImpl event = new ValidationEventImpl();
        String message = event.getMessage();
        System.out.println("Message: " + message);
    }
}
