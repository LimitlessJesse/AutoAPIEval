import java.util.Calendar;

public class Calendar_Builder_4 {
    public static void main(String[] args) {
        Calendar.Builder builder = new Calendar.Builder();
        builder.setTimeOfDay(10, 30, 45);
        Calendar calendar = builder.build();
        System.out.println(calendar.getTime());
    }
}
