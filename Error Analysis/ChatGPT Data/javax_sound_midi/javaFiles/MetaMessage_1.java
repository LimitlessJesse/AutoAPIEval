import javax.sound.midi.MetaMessage;

public class MetaMessage_1 {
    public static void main(String[] args) {
        MetaMessage metaMessage = new MetaMessage();
        int type = metaMessage.getType();
        System.out.println("MetaMessage type: " + type);
    }
}
