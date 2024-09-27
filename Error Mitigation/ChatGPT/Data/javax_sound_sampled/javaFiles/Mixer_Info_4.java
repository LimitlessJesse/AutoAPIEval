import javax.sound.sampled.Mixer;

public class Mixer_Info_4 {
    public static void main(String[] args) {
        Mixer.Info mixerInfo = new Mixer.Info("TestMixer", "TestVersion", "TestVendor", "TestDescription");
        String version = mixerInfo.getVersion();
        System.out.println("Mixer version: " + version);
    }
}
