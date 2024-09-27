import org.ietf.jgss.ChannelBinding;

public class ChannelBinding_3 {
    public static void main(String[] args) {
        ChannelBinding cb1 = new ChannelBinding();
        ChannelBinding cb2 = new ChannelBinding();
        
        boolean result = cb1.equals(cb2);
        System.out.println("Are the two ChannelBindings equal? " + result);
    }
}
