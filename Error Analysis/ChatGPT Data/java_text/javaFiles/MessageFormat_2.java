import java.text.MessageFormat;

public class MessageFormat_2 {
    public static void main(String[] args) {
        String pattern = "The {0} jumped over the {1}.";
        
        MessageFormat messageFormat = new MessageFormat(pattern);
        messageFormat.applyPattern("The {0} ran past the {1}.");
        
        Object[] arguments = {"fox", "dog"};
        String formattedMessage = messageFormat.format(arguments);
        
        System.out.println(formattedMessage);
    }
}
