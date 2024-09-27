import javax.naming.CompoundName;
import javax.naming.Name;
import javax.naming.InvalidNameException;
import java.util.Enumeration;

public class CompoundName_4 {
    public static void main(String[] args) {
        try {
            CompoundName compoundName = new CompoundName("example/name", null);
            Name prefix = compoundName.getPrefix(1);
            Enumeration<String> components = prefix.getAll();
            while (components.hasMoreElements()) {
                System.out.println(components.nextElement());
            }
        } catch (InvalidNameException e) {
            e.printStackTrace();
        }
    }
}
