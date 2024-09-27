import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiFileFormat;

public class MidiFileFormat_5 {
    public static void main(String[] args) {
        try {
            MidiFileFormat midiFileFormat = MidiSystem.getMidiFileFormat(new File("example.mid"));
            long microsecondLength = midiFileFormat.getMicrosecondLength();
            System.out.println("Microsecond length: " + microsecondLength);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
