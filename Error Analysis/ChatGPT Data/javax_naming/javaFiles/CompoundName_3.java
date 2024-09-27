import javax.naming.CompoundName;
import javax.naming.InvalidNameException;
import java.util.Enumeration;

public class CompoundName_3 {
    public static void main(String[] args) {
        try {
            CompoundName original = new CompoundName("test", null);
            CompoundName clone = (CompoundName) original.clone();
            
            // Display elements of the original CompoundName
            Enumeration<String> originalElements = original.getAll();
            System.out.print("Original CompoundName elements: ");
            while (originalElements.hasMoreElements()) {
                System.out.print(originalElements.nextElement() + ", ");
            }
            System.out.println();
            
            // Display elements of the cloned CompoundName
            Enumeration<String> clonedElements = clone.getAll();
            System.out.print("Cloned CompoundName elements: ");
            while (clonedElements.hasMoreElements()) {
                System.out.print(clonedElements.nextElement() + ", ");
            }
            System.out.println();
            
        } catch (InvalidNameException | CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
