import java.text.MessageFormat;

public class MessageFormat_5 {
    public static void main(String[] args) {
        String pattern = "Hello, {0}!";
        String message = MessageFormat.format(pattern, "World");
        System.out.println(message);
    }
}
