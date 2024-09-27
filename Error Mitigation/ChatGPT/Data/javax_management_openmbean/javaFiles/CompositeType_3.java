import javax.management.openmbean.CompositeType;
import java.util.Set;

public class CompositeType_3 {
    public static void main(String[] args) {
        CompositeType compositeType = new CompositeType("typeName", "description", new String[]{"key1", "key2"}, new String[]{"desc1", "desc2"}, new String[]{"type1", "type2"});
        Set<String> keySet = compositeType.keySet();
        System.out.println(keySet);
    }
}
