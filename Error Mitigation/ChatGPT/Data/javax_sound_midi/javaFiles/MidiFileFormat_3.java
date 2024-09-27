import javax.sound.midi.MidiFileFormat;

public class MidiFileFormat_3 {
    public static void main(String[] args) {
        MidiFileFormat midiFileFormat = new MidiFileFormat(MidiFileFormat.UNKNOWN_LENGTH, 0, 0, 0, 0);
        long microsecondLength = midiFileFormat.getMicrosecondLength();
        System.out.println("Microsecond Length: " + microsecondLength);
    }
}
