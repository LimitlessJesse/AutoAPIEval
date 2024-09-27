import java.text.DecimalFormat;
import java.text.FieldPosition;

public class DecimalFormat_2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        StringBuffer sb = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        sb = df.format(12345.67, sb, pos);
        System.out.println(sb);
    }
}
