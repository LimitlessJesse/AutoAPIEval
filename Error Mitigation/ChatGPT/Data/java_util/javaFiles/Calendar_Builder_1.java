import java.util.Calendar;

public class Calendar_Builder_1 {
    public static void main(String[] args) {
        Calendar.Builder builder = new Calendar.Builder();
        builder.set(Calendar.DAY_OF_MONTH, 15);
        System.out.println(builder.build());
    }
}
