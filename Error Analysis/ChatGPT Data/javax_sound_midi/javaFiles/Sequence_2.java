import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import java.io.File;
import java.io.IOException;

public class Sequence_2 {
    public static void main(String[] args) {
        try {
            Sequence sequence = MidiSystem.getSequence(new File("example.mid"));
            long microsecondLength = sequence.getMicrosecondLength();
            System.out.println("Microsecond Length: " + microsecondLength);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
