import java.util.Calendar;

public class Calendar_Builder_1 {
    public static void main(String[] args) {
        Calendar.Builder builder = new Calendar.Builder();
        builder.setDate(2022, Calendar.JANUARY, 1);
        Calendar calendar = builder.build();
        System.out.println(calendar.getTime());
    }
}
