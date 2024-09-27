import java.util.EnumMap;

public class EnumMap_2 {
    public static void main(String[] args) {
        EnumMap<Day, String> enumMap = new EnumMap<>(Day.class);
        enumMap.put(Day.MONDAY, "First day of the week");
        enumMap.put(Day.TUESDAY, "Second day of the week");

        System.out.println(enumMap.get(Day.MONDAY)); // Output: First day of the week
        System.out.println(enumMap.get(Day.WEDNESDAY)); // Output: null
    }

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
