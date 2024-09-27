import javax.sound.sampled.spi.MixerProvider;
import javax.sound.sampled.Mixer;

public class MixerProvider_2 {
    public static void main(String[] args) {
        MixerProvider provider = new CustomMixerProvider(); // CustomMixerProvider is a subclass of MixerProvider
        Mixer.Info info = new Mixer.Info("CustomMixer", "Custom Mixer Description", "Custom Vendor", "1.0");
        
        Mixer mixer = provider.getMixer(info);
        System.out.println("Obtained mixer: " + mixer);
    }
}
