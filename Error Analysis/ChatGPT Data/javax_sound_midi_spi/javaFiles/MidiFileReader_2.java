import javax.sound.midi.Sequence;
import javax.sound.midi.spi.MidiFileReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class MidiFileReader_2 {
    public static void main(String[] args) {
        try {
            MidiFileReader midiReader = new MidiFileReader();
            File midiFile = new File("example.mid");
            InputStream inputStream = new FileInputStream(midiFile);
            Sequence sequence = midiReader.getSequence(inputStream);
            System.out.println(sequence);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
