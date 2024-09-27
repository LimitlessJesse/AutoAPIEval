import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;
import javax.sound.midi.MidiUnavailableException;

public class MidiSystem_2 {
    public static void main(String[] args) {
        try {
            Synthesizer synthesizer = MidiSystem.getSynthesizer();
            System.out.println("Default Synthesizer: " + synthesizer);
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }
}
