import java.text.MessageFormat;

public class MessageFormat_1 {
    public static void main(String[] args) {
        String pattern = "Hello, {0}! Today is {1}.";
        
        String formattedMessage = MessageFormat.format(pattern, "Alice", "Monday");
        
        System.out.println(formattedMessage);
    }
}
