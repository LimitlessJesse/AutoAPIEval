import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;
import javax.sound.midi.MidiUnavailableException;

public class MidiSystem_1 {
    public static void main(String[] args) {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Default Sequencer: " + sequencer);
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }
}
