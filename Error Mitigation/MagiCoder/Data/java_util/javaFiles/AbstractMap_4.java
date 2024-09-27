import java.util.AbstractMap;
import java.util.Map;

public class AbstractMap_4 {
    public static void main(String[] args) {
        Map<String, Integer> map = new AbstractMap<>() {
            @Override
            public boolean isEmpty() {
                return size() == 0;
            }
        };

        System.out.println(map.isEmpty()); // Outputs: true
    }
}
