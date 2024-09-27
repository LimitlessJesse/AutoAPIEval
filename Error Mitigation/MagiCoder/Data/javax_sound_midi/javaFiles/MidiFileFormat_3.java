import javax.sound.midi.MidiFileFormat;

public class MidiFileFormat_3 {
    public static void main(String[] args) {
        MidiFileFormat midiFileFormat = new MidiFileFormat();
        int resolution = midiFileFormat.getResolution();
        System.out.println("Resolution: " + resolution);
    }
}
