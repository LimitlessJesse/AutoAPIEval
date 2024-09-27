import javax.sound.sampled.Mixer;

public class Mixer_Info_2 {
    public static void main(String[] args) {
        Mixer.Info mixerInfo = new Mixer.Info("TestMixer", "Version 1.0", "TestVendor", "This is a test mixer");
        String description = mixerInfo.getDescription();
        System.out.println("Mixer Description: " + description);
    }
}
