import javax.sound.sampled.spi.MixerProvider;
import javax.sound.sampled.Mixer;

public class MixerProvider_3 {
    public static void main(String[] args) {
        MixerProvider mixerProvider = new MixerProvider(); // Instantiate the MixerProvider
        Mixer.Info mixerInfo = new Mixer.Info("TestMixer", "TestVendor", "TestDescription", "TestVersion"); // Create a Mixer.Info object
        boolean isSupported = mixerProvider.isMixerSupported(mixerInfo); // Check if the specified mixer is supported
        System.out.println("Is Mixer Supported: " + isSupported);
    }
}
