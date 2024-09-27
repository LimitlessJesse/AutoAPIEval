import javax.naming.CompoundName;
import javax.naming.Name;
import javax.naming.InvalidNameException;

public class CompoundName_5 {
    public static void main(String[] args) {
        try {
            CompoundName compoundName = new CompoundName("example/name", null);
            Name suffix = compoundName.getSuffix(1);
            System.out.println(suffix.toString());
        } catch (InvalidNameException e) {
            e.printStackTrace();
        }
    }
}
