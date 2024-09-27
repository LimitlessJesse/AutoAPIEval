import javax.xml.bind.util.ValidationEventCollector;

public class ValidationEventCollector_3 {
    public static void main(String[] args) {
        ValidationEventCollector vec = new ValidationEventCollector();
        boolean hasEvents = vec.hasEvents();
        System.out.println("Validation Events Present: " + hasEvents);
    }
}
