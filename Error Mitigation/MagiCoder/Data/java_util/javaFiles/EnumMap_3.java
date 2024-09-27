import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public class EnumMap_3 {
    public static void main(String[] args) {
        EnumMap<MyEnum, String> enumMap = new EnumMap<>(MyEnum.class);
        enumMap.put(MyEnum.ONE, "One");
        enumMap.put(MyEnum.TWO, "Two");
        enumMap.put(MyEnum.THREE, "Three");

        Set<Map.Entry<MyEnum, String>> entrySet = enumMap.entrySet();

        for (Map.Entry<MyEnum, String> entry : entrySet) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

enum MyEnum {
    ONE, TWO, THREE
}
