import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Patch;
import javax.sound.midi.Synthesizer;

public class Patch_4 {
    public static void main(String[] args) {
        try {
            // Get a MIDI synthesizer
            Synthesizer synth = MidiSystem.getSynthesizer();
            synth.open();

            // Get the list of available patches
            Patch[] patches = synth.getAvailablePatches();

            // Get the program number of the first available patch
            int programNumber = patches[0].getProgram();

            System.out.println("Program number of the first available patch: " + programNumber);

            // Close the synthesizer
            synth.close();
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }
}
