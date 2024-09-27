import javax.sound.sampled.spi.MixerProvider;
import javax.sound.sampled.Mixer;

public class MixerProvider_1 {
    public static void main(String[] args) {
        Mixer.Info[] mixerInfo = MixerProvider.getMixerInfo();
        for (Mixer.Info info : mixerInfo) {
            System.out.println(info.getName());
            System.out.println(info.getDescription());
            System.out.println(info.getVendor());
            System.out.println("---------------------------");
        }
    }
}
