import java.lang.Long;

public class Long_4 {
    public static void main(String[] args) {
        String s = "100";
        int radix = 10;
        Long longObj = Long.valueOf(s, radix);
        System.out.println(longObj);
    }
}
