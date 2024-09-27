import java.text.DecimalFormat;
import java.text.ParsePosition;

public class DecimalFormat_5 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        ParsePosition pos = new ParsePosition(0);
        String source = "123.456";
        Number number = df.parse(source, pos);
        if (number!= null) {
            System.out.println(number);
        } else {
            System.out.println("Parse failed at position " + pos.getErrorIndex());
        }
    }
}
