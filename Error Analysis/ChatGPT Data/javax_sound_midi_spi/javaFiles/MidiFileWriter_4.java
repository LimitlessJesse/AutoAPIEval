import javax.sound.midi.spi.MidiFileWriter;

public class MidiFileWriter_4 {
    public static void main(String[] args) {
        MidiFileWriter midiFileWriter = new SomeMidiFileWriter(); // replace SomeMidiFileWriter with the actual implementation
        int[] midiFileTypes = midiFileWriter.getMidiFileTypes();
        
        System.out.print("Supported MIDI file types: ");
        for(int type : midiFileTypes){
            System.out.print(type + " ");
        }
    }
}
