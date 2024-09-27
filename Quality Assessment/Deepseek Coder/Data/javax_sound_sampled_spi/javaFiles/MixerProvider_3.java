import javax.sound.sampled.Mixer;
import javax.sound.sampled.spi.MixerProvider;
import java.util.Locale;

public class MixerProvider_3 {
    public static void main(String[] args) {
        // Get the default MixerProvider
        MixerProvider provider = Mixer.getDefaultMixerProvider();

        // Get the Mixer.Info array
        Mixer.Info[] infos = provider.getMixerInfo();

        // Check if the Mixer is supported
        for (Mixer.Info info : infos) {
            if (provider.isMixerSupported(info)) {
                System.out.println("Mixer: " + info.getName() + " is supported");
            } else {
                System.out.println("Mixer: " + info.getName() + " is not supported");
            }
        }
    }
}
