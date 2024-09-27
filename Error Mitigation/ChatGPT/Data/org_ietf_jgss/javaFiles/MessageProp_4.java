import org.ietf.jgss.MessageProp;

public class MessageProp_4 {
    public static void main(String[] args) {
        MessageProp messageProp = new MessageProp();
        boolean privacyState = messageProp.getPrivacy();
        System.out.println("Privacy state: " + privacyState);
    }
}
