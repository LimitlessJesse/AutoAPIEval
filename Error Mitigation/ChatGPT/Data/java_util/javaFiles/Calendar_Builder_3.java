import java.util.Calendar;

public class Calendar_Builder_3 {
    public static void main(String[] args) {
        Calendar.Builder builder = new Calendar.Builder();
        builder.setDate(2022, 0, 1); // January 1, 2022
        Calendar calendar = builder.build();
        System.out.println(calendar.getTime());
    }
}
