import javax.naming.CompoundName;
import javax.naming.Name;
import javax.naming.InvalidNameException;

public class CompoundName_3 {
    public static void main(String[] args) {
        try {
            CompoundName compoundName1 = new CompoundName("example", CompoundName.syntax);
            CompoundName compoundName2 = new CompoundName("test", CompoundName.syntax);
            
            boolean isSuffix = compoundName1.endsWith(compoundName2);
            System.out.println("Is compoundName2 a suffix of compoundName1? " + isSuffix);
        } catch (InvalidNameException e) {
            e.printStackTrace();
        }
    }
}
