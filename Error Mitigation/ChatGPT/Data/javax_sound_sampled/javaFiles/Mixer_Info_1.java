import javax.sound.sampled.Mixer;

public class Mixer_Info_1 {
    public static void main(String[] args) {
        Mixer.Info mixerInfo = new Mixer.Info("TestMixer", "TestVersion", "TestVendor", "TestDescription");
        String mixerName = mixerInfo.getName();
        System.out.println("Mixer Name: " + mixerName);
    }
}
