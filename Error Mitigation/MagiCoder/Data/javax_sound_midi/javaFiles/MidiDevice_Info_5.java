import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;

public class MidiDevice_Info_5 {
    public static void main(String[] args) {
        try {
            MidiDevice.Info[] infos = MidiSystem.getMidiDeviceInfo();
            for (MidiDevice.Info info : infos) {
                System.out.println("Device name: " + info.getName());
                System.out.println("Version: " + info.getVersion());
                System.out.println("Vendor: " + info.getVendor());
                System.out.println("Description: " + info.getDescription());
                System.out.println();
            }
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }
}
