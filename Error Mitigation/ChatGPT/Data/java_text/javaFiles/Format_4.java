import java.text.Format;
import java.text.ParsePosition;

public class Format_4 {
    public static void main(String[] args) {
        Format format = new Format() {
            @Override
            public Object parseObject(String source, ParsePosition pos) {
                // Custom implementation of parsing text to produce an object
                return null;
            }
        };
        
        String text = "12345";
        ParsePosition parsePosition = new ParsePosition(0);
        Object parsedObject = format.parseObject(text, parsePosition);
        
        System.out.println("Parsed Object: " + parsedObject);
        System.out.println("Index: " + parsePosition.getIndex());
        System.out.println("Error Index: " + parsePosition.getErrorIndex());
    }
}
