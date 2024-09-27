import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;

public class MidiDevice_Info_4 {
    public static void main(String[] args) {
        try {
            MidiDevice.Info[] infos = MidiSystem.getMidiDeviceInfo();
            for (MidiDevice.Info info : infos) {
                String version = info.getVersion();
                System.out.println("Device Name: " + info.getName() + ", Version: " + version);
            }
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }
}
