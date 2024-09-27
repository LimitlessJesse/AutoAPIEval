import java.util.AbstractMap;
import java.util.Collection;

public class AbstractMap_5 {
    public static void main(String[] args) {
        AbstractMap<String, Integer> map = new AbstractMap<String, Integer>() {
            @Override
            public Collection<Integer> values() {
                return null; // Return collection of values
            }
        };
    }
}
