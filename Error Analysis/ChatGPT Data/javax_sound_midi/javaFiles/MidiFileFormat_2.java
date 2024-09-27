import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiFileFormat;

public class MidiFileFormat_2 {
    public static void main(String[] args) {
        try {
            MidiFileFormat midiFileFormat = MidiSystem.getMidiFileFormat(new File("example.mid"));
            int resolution = midiFileFormat.getResolution();
            System.out.println("MIDI File Resolution: " + resolution);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
