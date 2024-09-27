import java.text.SimpleDateFormat;

public class SimpleDateFormat_3 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("yyyy-MM-dd");
        System.out.println(sdf.toPattern());
    }
}
