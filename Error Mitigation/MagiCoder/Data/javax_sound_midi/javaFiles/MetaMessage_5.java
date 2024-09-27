import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MetaMessage;

public class MetaMessage_5 {
    public static void main(String[] args) {
        try {
            MetaMessage metaMessage = new MetaMessage();
            byte[] data = {0x01, 0x02, 0x03}; // example data
            metaMessage.setMessage(0x01, data, data.length); // set message
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }
}
