import javax.sound.midi.Sequence;
import javax.sound.midi.spi.MidiFileWriter;
import java.io.File;

public class MidiFileWriter_2 {
    public static void main(String[] args) {
        MidiFileWriter midiFileWriter = new MidiFileWriter();
        Sequence sequence = new Sequence(Sequence.PPQ, 1);
        File file = new File("output.mid");
        
        try {
            int fileType = MidiFileWriter.MIDI_TYPE_1;
            int bytesWritten = midiFileWriter.write(sequence, fileType, file);
            System.out.println("Bytes written: " + bytesWritten);
        } catch (Exception e) {
            System.err.println("Error writing MIDI file: " + e.getMessage());
        }
    }
}
