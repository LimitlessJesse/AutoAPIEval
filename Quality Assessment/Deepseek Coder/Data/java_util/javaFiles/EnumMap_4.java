import java.util.EnumMap;

public class EnumMap_4 {
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

        boolean isKeyPresent = map.containsKey(Days.MON);
        System.out.println("Is key 'MON' present? " + isKeyPresent);

        isKeyPresent = map.containsKey(Days.SUN);
        System.out.println("Is key 'SUN' present? " + isKeyPresent);

        isKeyPresent = map.containsKey(Days.JUN);
        System.out.println("Is key 'JUN' present? " + isKeyPresent);
    }
}
