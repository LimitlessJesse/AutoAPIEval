import javax.sound.midi.MidiSystem;
import javax.sound.midi.Transmitter;

public class MidiSystem_4 {
    public static void main(String[] args) {
        try {
            Transmitter transmitter = MidiSystem.getTransmitter();
            System.out.println("Transmitter obtained: " + transmitter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
