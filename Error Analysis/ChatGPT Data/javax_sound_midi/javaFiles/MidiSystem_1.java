import javax.sound.midi.MidiSystem;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import java.io.IOException;
import java.net.URL;

public class MidiSystem_1 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.example.com/example.mid");
            Sequence sequence = MidiSystem.getSequence(url);
            System.out.println("Sequence loaded successfully!");
        } catch (IOException | InvalidMidiDataException | MidiUnavailableException e) {
            System.out.println("Error loading MIDI sequence: " + e.getMessage());
        }
    }
}
