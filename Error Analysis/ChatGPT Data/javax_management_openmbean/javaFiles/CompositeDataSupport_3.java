import javax.management.openmbean.CompositeDataSupport;

public class CompositeDataSupport_3 {
    public static void main(String[] args) {
        // create a sample CompositeDataSupport object
        CompositeDataSupport data = new CompositeDataSupport(null);

        // check if the CompositeDataSupport object contains a specific key
        boolean containsKey = data.containsKey("keyName");

        System.out.println("Contains key 'keyName': " + containsKey);
    }
}
