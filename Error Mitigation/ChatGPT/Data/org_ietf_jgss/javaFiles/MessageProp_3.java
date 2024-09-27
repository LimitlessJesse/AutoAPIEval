import org.ietf.jgss.MessageProp;

public class MessageProp_3 {
    public static void main(String[] args) {
        MessageProp messageProp = new MessageProp();
        messageProp.setPrivacy(true);
        System.out.println("Privacy state set to: " + messageProp.getPrivacy());
    }
}
