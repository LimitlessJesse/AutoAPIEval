import javax.sound.sampled.Mixer;

public class Mixer_Info_2 {
    public static void main(String[] args) {
        Mixer.Info mixerInfo = new Mixer.Info("Test Mixer", "Test Vendor", "Test Description", "Test Version");

        String name = mixerInfo.getName();
        System.out.println("Mixer name: " + name);
    }
}
