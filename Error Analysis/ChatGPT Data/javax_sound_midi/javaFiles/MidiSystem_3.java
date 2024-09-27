import javax.sound.midi.MidiSystem;
import javax.sound.midi.Receiver;

public class MidiSystem_3 {
    public static void main(String[] args) {
        try {
            Receiver receiver = MidiSystem.getReceiver();
            System.out.println("Receiver obtained: " + receiver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
