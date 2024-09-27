import javax.sound.midi.MidiDevice;

public class MidiDevice_Info_3 {
    public static void main(String[] args) {
        MidiDevice.Info info = new MidiDevice.Info("MidiDevice", "Vendor", "Description", "Version");
        String description = info.getDescription();
        System.out.println(description);
    }
}
