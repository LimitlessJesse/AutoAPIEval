import java.text.Format;
import java.text.ParsePosition;

public class Format_5 {
    public static void main(String[] args) {
        Format format = new Format() {
            @Override
            public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {
                return null;
            }

            @Override
            public Object parseObject(String source, ParsePosition pos) {
                return null;
            }
        };

        String source = "123";
        ParsePosition parsePosition = new ParsePosition(0);
        Object parsedObject = format.parseObject(source, parsePosition);
        System.out.println(parsedObject);
    }
}
