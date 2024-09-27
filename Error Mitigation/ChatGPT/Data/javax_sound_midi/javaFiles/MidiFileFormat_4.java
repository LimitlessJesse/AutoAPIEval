import javax.sound.midi.MidiFileFormat;

public class MidiFileFormat_4 {
    public static void main(String[] args) {
        MidiFileFormat midiFileFormat = new MidiFileFormat(null, 0, 0, 0, 0);
        int resolution = midiFileFormat.getResolution();
        System.out.println("Resolution: " + resolution);
    }
}
