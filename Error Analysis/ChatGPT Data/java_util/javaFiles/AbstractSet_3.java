import java.util.AbstractSet;

public class AbstractSet_3 {
    public static void main(String[] args) {
        AbstractSet<String> set = new AbstractSet<String>() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
        
        // Print the hash code value for this set
        System.out.println("Hash code value: " + set.hashCode());
    }
}
