import javax.sound.midi.MidiFileFormat;

public class MidiFileFormat_4 {
    public static void main(String[] args) {
        MidiFileFormat midiFileFormat = new MidiFileFormat();
        int type = midiFileFormat.getType();
        System.out.println("MIDI file type: " + type);
    }
}
