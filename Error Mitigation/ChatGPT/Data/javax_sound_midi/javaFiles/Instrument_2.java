import javax.sound.midi.Instrument;

public class Instrument_2 {
    public static void main(String[] args) {
        Instrument instrument = new Instrument(); // Instantiate an Instrument object
        Patch patch = instrument.getPatch(); // Get the Patch object
        System.out.println("Bank number: " + patch.getBank());
        System.out.println("Program number: " + patch.getProgram());
    }
}
