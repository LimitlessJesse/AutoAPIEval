import java.text.ParsePosition;

public class ParsePosition_2 {
    public static void main(String[] args) {
        ParsePosition parsePosition = new ParsePosition(0);
        parsePosition.setErrorIndex(5);
        System.out.println("Error index: " + parsePosition.getErrorIndex());
    }
}
