import javax.sound.midi.MidiFileFormat;

public class MidiFileFormat_1 {
    public static void main(String[] args) {
        MidiFileFormat midiFileFormat = new MidiFileFormat(Type, divisionType, resolution);
        int type = midiFileFormat.getType();
        System.out.println("MIDI file type: " + type);
    }
}
