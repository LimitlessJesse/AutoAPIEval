import java.text.ParsePosition;

public class ParsePosition_3 {
    public static void main(String[] args) {
        ParsePosition parsePosition = new ParsePosition(0);
        parsePosition.setIndex(5);
        System.out.println("Current parse position: " + parsePosition.getIndex());
    }
}
