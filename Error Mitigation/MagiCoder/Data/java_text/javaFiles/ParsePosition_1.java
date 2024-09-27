import java.text.ParsePosition;

public class ParsePosition_1 {
    public static void main(String[] args) {
        ParsePosition parsePosition = new ParsePosition(0);
        parsePosition.setErrorIndex(5);
        int errorIndex = parsePosition.getErrorIndex();
        System.out.println("Error index: " + errorIndex);
    }
}
