import javax.sound.midi.Sequence;
import javax.sound.midi.InvalidMidiDataException;

public class Sequence_3 {
    public static void main(String[] args) {
        try {
            // Create a new sequence
            Sequence sequence = new Sequence(Sequence.PPQ, 480);

            // Get the resolution of the sequence
            int resolution = sequence.getResolution();

            System.out.println("Resolution: " + resolution);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }
}
