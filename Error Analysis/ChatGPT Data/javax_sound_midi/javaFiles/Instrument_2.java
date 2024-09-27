import javax.sound.midi.*;

public class Instrument_2 {
    public static void main(String[] args) {
        Soundbank soundbank = MidiSystem.getSoundbank(new File("soundbank.sf2"));
        Instrument[] instruments = soundbank.getInstruments();
        
        if (instruments.length > 0) {
            Patch patch = instruments[0].getPatch();
            System.out.println("Patch: " + patch);
        } else {
            System.out.println("No instruments found");
        }
    }
}
