import java.util.EnumMap;

public class EnumMap_3 {
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

        System.out.println("Original EnumMap: " + map);

        map.remove(Days.SAT);
        map.remove(Days.SUN);

        System.out.println("EnumMap after removing SAT and SUN: " + map);
    }
}
