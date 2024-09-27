import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiSystem;

public class MidiSystem_5 {
    public static void main(String[] args) {
        MidiDevice.Info[] infos = MidiSystem.getMidiDeviceInfo();
        
        if (infos.length == 0) {
            System.out.println("No MIDI devices installed.");
        } else {
            for (MidiDevice.Info info : infos) {
                System.out.println(info);
            }
        }
    }
}
