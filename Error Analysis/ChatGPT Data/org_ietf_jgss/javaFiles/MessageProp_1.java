import org.ietf.jgss.MessageProp;

public class MessageProp_1 {
    public static void main(String[] args) {
        MessageProp messageProp = new MessageProp(0, false);
        int qop = messageProp.getQOP();
        System.out.println("QOP: " + qop);
    }
}
