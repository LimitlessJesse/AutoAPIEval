import java.util.EnumMap;
import java.util.Collection;

public class EnumMap_5 {
    public static void main(String[] args) {
        EnumMap<MyEnum, String> enumMap = new EnumMap<>(MyEnum.class);
        enumMap.put(MyEnum.ONE, "One");
        enumMap.put(MyEnum.TWO, "Two");
        
        Collection<String> values = enumMap.values();
        for (String value : values) {
            System.out.println(value);
        }
    }
}

enum MyEnum {
    ONE, TWO, THREE
}
