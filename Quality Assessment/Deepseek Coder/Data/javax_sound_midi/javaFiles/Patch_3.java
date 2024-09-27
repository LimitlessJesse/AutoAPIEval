import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Patch;
import javax.sound.midi.Soundbank;
import java.util.HashMap;

public class Patch_3 {
    public static void main(String[] args) {
        try {
            Soundbank soundbank = MidiSystem.getSoundbank("your_soundbank_path");
            HashMap<String, Patch> patches = soundbank.getPatches();
            for (Patch patch : patches.values()) {
                int bank = patch.getBank();
                System.out.println("Bank: " + bank);
            }
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }
}
