import javax.naming.CompoundName;
import javax.naming.InvalidNameException;
import java.util.Enumeration;

public class CompoundName_4 {
    public static void main(String[] args) {
        try {
            // Create a CompoundName
            CompoundName cn = new CompoundName("joe/doe", CompoundName.DOT);
            
            // Check if the name ends with "doe"
            boolean endsWithDoe = cn.endsWith(new CompoundName("doe", CompoundName.DOT));
            System.out.println("Name ends with 'doe': " + endsWithDoe);
        } catch (InvalidNameException e) {
            e.printStackTrace();
        }
    }
}
