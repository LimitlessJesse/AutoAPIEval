import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.SysexMessage;

public class SysexMessage_3 {
    public static void main(String[] args) {
        try {
            SysexMessage sysexMessage = new SysexMessage();
            byte[] data = {0xF0, 0x7F, 0x7F, 0x04, 0x01, 0xF7};
            sysexMessage.setMessage(data, data.length);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }
}
