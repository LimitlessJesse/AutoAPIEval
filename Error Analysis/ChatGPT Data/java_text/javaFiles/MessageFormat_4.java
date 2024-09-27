import java.text.Format;
import java.text.MessageFormat;

public class MessageFormat_4 {
    public static void main(String[] args) {
        MessageFormat messageFormat = new MessageFormat("The price is {0,number,currency}");
        Format newFormat = new java.text.DecimalFormat("#,##0.00");
        
        messageFormat.setFormatByArgumentIndex(0, newFormat);
        
        Object[] priceArgs = {1234.56};
        String formattedMessage = messageFormat.format(priceArgs);
        
        System.out.println(formattedMessage);
    }
}
