import java.text.FieldPosition;
import java.text.Format;

public class Format_3 {
    public static void main(String[] args) {
        Format formatter = new Format() {
            @Override
            public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {
                // Custom formatting logic here
                return toAppendTo.append(obj.toString());
            }

            @Override
            public Object parseObject(String source, ParsePosition pos) {
                return null;
            }
        };

        StringBuffer buffer = new StringBuffer();
        FieldPosition fieldPosition = new FieldPosition(0);

        Object objectToFormat = "Example";
        formatter.format(objectToFormat, buffer, fieldPosition);

        System.out.println(buffer.toString());
    }
}
