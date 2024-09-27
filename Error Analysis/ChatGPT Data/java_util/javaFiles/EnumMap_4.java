import java.util.EnumMap;
import java.util.Collection;

public class EnumMap_4 {
    public static void main(String[] args) {
        EnumMap<Day, String> enumMap = new EnumMap<>(Day.class);
        enumMap.put(Day.MONDAY, "Work");
        enumMap.put(Day.TUESDAY, "Study");
        Collection<String> values = enumMap.values();
        System.out.println(values);
    }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
