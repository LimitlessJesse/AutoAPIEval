import javax.xml.bind.helpers.ValidationEventImpl;

public class ValidationEventImpl_1 {
    public static void main(String[] args) {
        ValidationEventImpl event = new ValidationEventImpl();
        int severity = event.getSeverity();
        System.out.println("Severity code: " + severity);
    }
}
