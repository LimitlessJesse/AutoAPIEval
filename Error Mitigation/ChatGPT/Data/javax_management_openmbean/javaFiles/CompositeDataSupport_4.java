import javax.management.openmbean.CompositeDataSupport;

public class CompositeDataSupport_4 {
    public static void main(String[] args) {
        CompositeDataSupport data = new CompositeDataSupport();
        boolean result = data.containsKey("key");
        System.out.println("Contains key: " + result);
    }
}
