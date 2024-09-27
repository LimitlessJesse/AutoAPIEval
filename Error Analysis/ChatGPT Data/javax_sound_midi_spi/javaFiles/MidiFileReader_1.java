import javax.sound.midi.Sequence;
import javax.sound.midi.spi.MidiFileReader;
import java.io.File;
import java.io.IOException;

public class MidiFileReader_1 {
    public static void main(String[] args) {
        File midiFile = new File("example.mid");
        MidiFileReader midiFileReader = new MidiFileReader();

        try {
            Sequence sequence = midiFileReader.getSequence(midiFile);
            System.out.println("Sequence loaded successfully");
        } catch (IOException e) {
            System.out.println("Error loading sequence: " + e.getMessage());
        }
    }
}
