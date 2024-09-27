import javax.naming.directory.BasicAttribute;
import javax.naming.NamingException;

public class BasicAttribute_7 {
    public static void main(String[] args) {
        try {
            BasicAttribute attribute = new BasicAttribute("name");
            attribute.add("value1");
            attribute.add("value2");
            attribute.add("value3");

            // get the value at index 1
            Object value = attribute.get(1);
            System.out.println(value);
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
