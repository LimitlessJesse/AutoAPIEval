import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MetaMessage;

public class MetaMessage_3 {
    public static void main(String[] args) {
        MetaMessage metaMessage = new MetaMessage();
        int type = 0x01; // Example meta-message type
        byte[] data = {0x02, 0x03, 0x04}; // Example data bytes
        int length = data.length;
        
        try {
            metaMessage.setMessage(type, data, length);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }
}
