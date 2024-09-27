import javax.sound.midi.MidiFileFormat;

public class MidiFileFormat_1 {
    public static void main(String[] args) {
        MidiFileFormat midiFileFormat = new MidiFileFormat(1, 1000, 480);
        int fileType = midiFileFormat.getType();
        System.out.println("MIDI file type: " + fileType);
    }
}
