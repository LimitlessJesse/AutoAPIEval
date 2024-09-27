import java.util.Calendar;

public class Calendar_Builder_2 {
    public static void main(String[] args) {
        Calendar.Builder builder = new Calendar.Builder();
        Calendar calendar = builder.build();
        System.out.println(calendar.getTime());
    }
}
