import java.text.SimpleDateFormat;

public class SimpleDateFormat_4 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String pattern = sdf.toPattern();
        System.out.println("Pattern: " + pattern);
    }
}
