import javax.management.openmbean.CompositeDataSupport;
import javax.management.openmbean.InvalidKeyException;

public class CompositeDataSupport_2 {
    public static void main(String[] args) {
        CompositeDataSupport data = new CompositeDataSupport();
        try {
            Object value = data.get("key");
            System.out.println("Value: " + value);
        } catch (IllegalArgumentException | InvalidKeyException e) {
            e.printStackTrace();
        }
    }
}
