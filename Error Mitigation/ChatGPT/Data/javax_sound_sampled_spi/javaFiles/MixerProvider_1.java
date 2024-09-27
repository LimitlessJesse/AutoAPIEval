import javax.sound.sampled.spi.MixerProvider;
import javax.sound.sampled.Mixer;

public class MixerProvider_1 {
    public static void main(String[] args) {
        MixerProvider provider = new MyMixerProvider(); // Replace MyMixerProvider with your custom MixerProvider implementation
        Mixer.Info[] mixerInfo = provider.getMixerInfo();
        
        for (Mixer.Info info : mixerInfo) {
            System.out.println(info.getName());
            System.out.println(info.getDescription());
            System.out.println(info.getVendor());
            System.out.println("-----");
        }
    }
}
