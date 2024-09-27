import javax.sound.midi.MidiSystem;
import javax.sound.midi.Receiver;
import javax.sound.midi.MidiUnavailableException;

public class MidiSystem_3 {
    public static void main(String[] args) {
        try {
            Receiver receiver = MidiSystem.getReceiver();
            System.out.println("Default MIDI Receiver: " + receiver);
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }
}
