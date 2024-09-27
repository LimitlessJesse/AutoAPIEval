import java.text.MessageFormat;

public class MessageFormat_4 {
    public static void main(String[] args) {
        MessageFormat messageFormat = new MessageFormat();
        String pattern = "This is a {0} message with {1} placeholders";
        messageFormat.applyPattern(pattern);
    }
}
