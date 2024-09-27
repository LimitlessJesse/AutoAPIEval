import java.util.HashMap;

public class HashMap_1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");

        String value = map.get(2);
        System.out.println("Value at key 2: " + value);
    }
}
