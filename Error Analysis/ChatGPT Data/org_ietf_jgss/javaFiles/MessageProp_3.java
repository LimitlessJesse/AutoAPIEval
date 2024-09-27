import org.ietf.jgss.MessageProp;

public class MessageProp_3 {
    public static void main(String[] args) {
        MessageProp prop = new MessageProp(0, false);
        int minorStatus = prop.getMinorStatus();
        System.out.println("Minor status: " + minorStatus);
    }
}
