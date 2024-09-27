import java.util.TimeZone;

public class TimeZone_4 {
    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("PST"));
        System.out.println(TimeZone.getDefault());
    }
}
