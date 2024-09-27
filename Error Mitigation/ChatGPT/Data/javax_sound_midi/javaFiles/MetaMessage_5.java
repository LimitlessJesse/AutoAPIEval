import javax.sound.midi.MetaMessage;

public class MetaMessage_5 {
    public static void main(String[] args) {
        MetaMessage metaMessage = new MetaMessage();
        MetaMessage clonedMessage = (MetaMessage) metaMessage.clone();
        
        System.out.println("Original MetaMessage: " + metaMessage);
        System.out.println("Cloned MetaMessage: " + clonedMessage);
    }
}
