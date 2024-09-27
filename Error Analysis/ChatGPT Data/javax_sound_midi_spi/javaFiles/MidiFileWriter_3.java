import javax.sound.midi.Sequence;
import javax.sound.midi.spi.MidiFileWriter;
import java.io.OutputStream;
import java.io.IOException;

public class MidiFileWriter_3 {
    public static void main(String[] args) {
        MidiFileWriter midiFileWriter = new MidiFileWriter();
        Sequence sequence = new Sequence(); // Create a Sequence object
        int fileType = 0; // Set type of MIDI file
        OutputStream outputStream = System.out;
        
        try {
            midiFileWriter.write(sequence, fileType, outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
