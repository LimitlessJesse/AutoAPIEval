import javax.management.openmbean.CompositeType;
import java.util.Set;

public class CompositeType_3 {
    public static void main(String[] args) {
        CompositeType compositeType = new CompositeType("Person", "Person Details",
                new String[]{"ID", "Name", "Age"},
                new String[]{"ID", "Name", "Age"},
                new String[]{"java.lang.Integer", "java.lang.String", "java.lang.Integer"});
        
        Set<String> keySet = compositeType.keySet();
        System.out.println("Keys in CompositeType: " + keySet);
    }
}
