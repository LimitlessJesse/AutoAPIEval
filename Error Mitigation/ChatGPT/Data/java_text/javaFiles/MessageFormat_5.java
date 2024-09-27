import java.text.Format;
import java.text.MessageFormat;

public class MessageFormat_5 {
    public static void main(String[] args) {
        MessageFormat messageFormat = new MessageFormat("This is a {0} message with {1} arguments");
        Format[] newFormats = {new MessageFormat("bold"), new MessageFormat("italic")};
        messageFormat.setFormatsByArgumentIndex(newFormats);
        
        Object[] arguments = {"formatted", "multiple"};
        String formattedMessage = messageFormat.format(arguments);
        System.out.println(formattedMessage);
    }
}
