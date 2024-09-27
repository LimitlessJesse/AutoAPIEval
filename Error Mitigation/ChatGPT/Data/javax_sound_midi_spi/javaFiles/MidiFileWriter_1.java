import javax.sound.midi.spi.MidiFileWriter;

public class MidiFileWriter_1 {
    public static void main(String[] args) {
        MidiFileWriter midiFileWriter = new MidiFileWriter() {
            @Override
            public int[] getMidiFileTypes() {
                // Implement the logic to obtain the set of MIDI file types
                return new int[]{0, 1, 2}; // Example file types
            }
        };

        int[] fileTypes = midiFileWriter.getMidiFileTypes();
        for (int fileType : fileTypes) {
            System.out.println("MIDI File Type: " + fileType);
        }
    }
}
