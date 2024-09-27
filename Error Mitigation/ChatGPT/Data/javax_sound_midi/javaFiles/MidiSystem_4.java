import javax.sound.midi.MidiSystem;
import javax.sound.midi.Transmitter;
import javax.sound.midi.MidiUnavailableException;

public class MidiSystem_4 {
    public static void main(String[] args) {
        try {
            Transmitter transmitter = MidiSystem.getTransmitter();
            System.out.println("Default MIDI Transmitter: " + transmitter);
        } catch (MidiUnavailableException e) {
            System.out.println("MIDI Unavailable Exception: " + e.getMessage());
        }
    }
}
