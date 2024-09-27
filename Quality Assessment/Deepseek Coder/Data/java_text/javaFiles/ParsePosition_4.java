import java.text.ParsePosition;

public class ParsePosition_4 {
    public static void main(String[] args) {
        ParsePosition parsePosition = new ParsePosition(0);
        String s = "Hello, World!";
        parsePosition.parse(s);
        int index = parsePosition.getIndex();
        System.out.println("The index where parsing ended is: " + index);
    }
}
