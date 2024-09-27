import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiFileFormat;
import javax.sound.midi.InvalidMidiDataException;
import java.io.File;
import java.io.IOException;

public class MidiFileFormat_4 {
    public static void main(String[] args) {
        File midiFile = new File("path/to/your/midi/file.mid");
        
        try {
            MidiFileFormat midiFileFormat = MidiSystem.getMidiFileFormat(midiFile);
            int byteLength = midiFileFormat.getByteLength();
            System.out.println("Byte length of the MIDI file: " + byteLength + " bytes");
        } catch (InvalidMidiDataException | IOException e) {
            e.printStackTrace();
        }
    }
}
