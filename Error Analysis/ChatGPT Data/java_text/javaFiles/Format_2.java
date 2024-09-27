import java.text.FieldPosition;
import java.text.Format;

public class Format_2 {
    public static void main(String[] args) {
        Format format = new Format() {
            @Override
            public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {
                // Implement the formatting logic here
                return toAppendTo.append(obj.toString());
            }

            @Override
            public Object parseObject(String source, ParsePosition pos) {
                return null;
            }
        };
        
        StringBuffer buffer = new StringBuffer();
        FieldPosition fieldPosition = new FieldPosition(0);
        format.format("Hello, World!", buffer, fieldPosition);
        System.out.println(buffer);
    }
}
