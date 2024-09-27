import java.util.EnumMap;

public class EnumMap_1 {
    public static void main(String[] args) {
        EnumMap<Day, String> enumMap = new EnumMap<>(Day.class);
        enumMap.put(Day.MONDAY, "First day of the week");
        System.out.println(enumMap);
    }

    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
