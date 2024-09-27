import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

public class Sequence_3 {
    public static void main(String[] args) {
        try {
            Sequence sequence = MidiSystem.getSequence(new java.io.File("path_to_your_midi_file.mid"));
            int resolution = sequence.getResolution();
            System.out.println("Resolution: " + resolution);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
