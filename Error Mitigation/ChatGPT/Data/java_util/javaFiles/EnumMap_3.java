import java.util.EnumMap;

public class EnumMap_3 {
    public static void main(String[] args) {
        EnumMap<Day, String> enumMap = new EnumMap<>(Day.class);
        enumMap.put(Day.MONDAY, "Monday");
        enumMap.put(Day.TUESDAY, "Tuesday");
        
        System.out.println("Before clear: " + enumMap);
        
        enumMap.clear();
        
        System.out.println("After clear: " + enumMap);
    }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
