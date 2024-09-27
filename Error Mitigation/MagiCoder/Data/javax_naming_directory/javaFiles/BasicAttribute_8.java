import javax.naming.directory.BasicAttribute;
import javax.naming.directory.Attribute;
import java.util.Hashtable;

public class BasicAttribute_8 {
    public static void main(String[] args) {
        Hashtable<String, Attribute> ht = new Hashtable<>();
        Attribute attr = new BasicAttribute("attrName");
        ht.put("attrName", attr);

        int size = attr.size();
        System.out.println("Size of attribute: " + size);
    }
}
