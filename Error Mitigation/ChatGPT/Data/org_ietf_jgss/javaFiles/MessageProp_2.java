import org.ietf.jgss.MessageProp;

public class MessageProp_2 {
    public static void main(String[] args) {
        MessageProp messageProp = new MessageProp();
        int qop = messageProp.getQOP();
        System.out.println("QOP value: " + qop);
    }
}
