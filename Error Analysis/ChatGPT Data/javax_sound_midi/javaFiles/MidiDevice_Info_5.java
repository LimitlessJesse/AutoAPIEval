import javax.sound.midi.MidiDevice;

public class MidiDevice_Info_5 {
    public static void main(String[] args) {
        MidiDevice.Info info = new MidiDevice.Info("Name", "Vendor", "Description", "Version");
        String infoString = info.toString();
        System.out.println(infoString);
    }
}
