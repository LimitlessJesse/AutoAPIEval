import java.util.EnumMap;

public class EnumMap_2 {
    enum Size {
        SMALL, MEDIUM, LARGE
    }

    public static void main(String[] args) {
        EnumMap<Size, String> map = new EnumMap<>(Size.class);
        map.put(Size.SMALL, "S");
        map.put(Size.MEDIUM, "M");
        map.put(Size.LARGE, "L");

        System.out.println(map.get(Size.MEDIUM));  // Output: M
    }
}
