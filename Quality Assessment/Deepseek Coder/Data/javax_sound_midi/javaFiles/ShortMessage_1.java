import javax.sound.midi.ShortMessage;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiUnavailableException;

public class ShortMessage_1 {
    public static void main(String[] args) {
        try {
            ShortMessage msg = new ShortMessage();
            MidiChannel channel = MidiSystem.getMidiChannel(0);
            msg.setMessage(ShortMessage.NOTE_ON, 1, 100, 100);
            channel.send(msg, 1);
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }
}
