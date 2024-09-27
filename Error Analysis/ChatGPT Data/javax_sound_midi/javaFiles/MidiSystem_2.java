import javax.sound.midi.Sequence;
import javax.sound.midi.MidiSystem;

public class MidiSystem_2 {
    public static void main(String[] args) {
        try {
            Sequence sequence = MidiSystem.getSequence(new File("path/to/your/midi/file.mid"));
            System.out.println("Successfully loaded MIDI file");
        } catch (Exception e) {
            System.out.println("Error loading MIDI file: " + e.getMessage());
        }
    }
}
