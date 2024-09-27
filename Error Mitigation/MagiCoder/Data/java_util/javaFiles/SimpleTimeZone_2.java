import java.util.SimpleTimeZone;

public class SimpleTimeZone_2 {
    public static void main(String[] args) {
        SimpleTimeZone stz = new SimpleTimeZone(0, 0, "GMT");
        long date = System.currentTimeMillis();
        int offset = stz.getOffset(date);
        System.out.println("The offset of this time zone from UTC at the given time is: " + offset);
    }
}
