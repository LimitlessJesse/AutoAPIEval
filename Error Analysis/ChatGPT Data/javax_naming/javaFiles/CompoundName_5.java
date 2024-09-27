import javax.naming.CompoundName;
import javax.naming.InvalidNameException;

public class CompoundName_5 {
    public static void main(String[] args) {
        try {
            CompoundName compoundName = new CompoundName("test/name/example", null);
            System.out.println("Prefix at position 1: " + compoundName.getPrefix(1));
        } catch (InvalidNameException e) {
            e.printStackTrace();
        }
    }
}
