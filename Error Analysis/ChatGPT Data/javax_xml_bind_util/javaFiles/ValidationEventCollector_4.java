import javax.xml.bind.util.ValidationEventCollector;

public class ValidationEventCollector_4 {
    public static void main(String[] args) {
        ValidationEventCollector eventCollector = new ValidationEventCollector();
        eventCollector.add(new javax.xml.bind.util.ValidationEvent(
                javax.xml.bind.util.ValidationEvent.ERROR,
                "Validation Error Message",
                new javax.xml.bind.util.ValidationEventLocator(null)
        ));

        System.out.println("Events before reset: " + eventCollector);

        eventCollector.reset();

        System.out.println("Events after reset: " + eventCollector);
    }
}
