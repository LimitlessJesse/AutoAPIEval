import javax.sound.sampled.Mixer;
import javax.sound.sampled.spi.MixerProvider;

public class MixerProvider_3 {
    public static void main(String[] args) {
        MixerProvider mixerProvider = new MixerProvider() {
            // Implement the abstract methods here
        };

        Mixer.Info info = new Mixer.Info[1];
        Mixer mixer = mixerProvider.getMixer(info[0]);
    }
}
