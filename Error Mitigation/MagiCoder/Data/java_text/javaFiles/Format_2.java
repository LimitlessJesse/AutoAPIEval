import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;

public class Format_2 {
    public static void main(String[] args) {
        Format format = new Format() {
            @Override
            public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {
                return toAppendTo.append(obj.toString());
            }

            @Override
            public Object parseObject(String source, ParsePosition pos) {
                return null;
            }
        };

        StringBuffer sb = new StringBuffer();
        FieldPosition fp = new FieldPosition(0);
        format.format("Hello, World!", sb, fp);

        System.out.println(sb);
    }
}
