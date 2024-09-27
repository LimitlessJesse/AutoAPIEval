import java.util.EnumMap;

public class EnumMap_5 {
    enum Days {
        MON, TUE, WED, THU, FRI, SAT, SUN
    }

    public static void main(String[] args) {
        EnumMap<Days, String> map = new EnumMap<>(Days.class);
        map.put(Days.MON, "Monday");
        map.put(Days.TUE, "Tuesday");
        map.put(Days.WED, "Wednesday");
        map.put(Days.THU, "Thursday");
        map.put(Days.FRI, "Friday");
        map.put(Days.SAT, "Saturday");
        map.put(Days.SUN, "Sunday");

        boolean isValuePresent = map.containsValue("Monday");
        System.out.println("Is 'Monday' present in the map? " + isValuePresent);

        isValuePresent = map.containsValue("Not a day");
        System.out.println("Is 'Not a day' present in the map? " + isValuePresent);
    }
}
