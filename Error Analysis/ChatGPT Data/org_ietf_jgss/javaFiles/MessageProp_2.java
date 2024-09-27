import org.ietf.jgss.MessageProp;

public class MessageProp_2 {
    public static void main(String[] args) {
        MessageProp prop1 = new MessageProp(0, false);
        MessageProp prop2 = new MessageProp(0, false);
        
        boolean isDuplicate = prop1.isDuplicateToken(prop2);
        System.out.println("Is duplicate token: " + isDuplicate);
    }
}
