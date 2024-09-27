import javax.sound.midi.spi.MidiFileWriter;
import javax.sound.midi.Sequence;
import java.util.Arrays;

public class MidiFileWriter_5 {
    public static void main(String[] args) {
        MidiFileWriter midiFileWriter = new MidiFileWriter();
        Sequence sequence = new Sequence();
        int[] midiFileTypes = midiFileWriter.getMidiFileTypes(sequence);
        System.out.println(Arrays.toString(midiFileTypes));
    }
}
