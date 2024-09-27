import java.util.HashMap;

public class HashMap_5 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "Hello");
        map.put("2", "World");

        System.out.println(map);  // {1=Hello, 2=World}

        map.remove("1");

        System.out.println(map);  // {2=World}
    }
}
