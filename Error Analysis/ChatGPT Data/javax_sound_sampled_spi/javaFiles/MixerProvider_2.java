import javax.sound.sampled.*;
import javax.sound.sampled.spi.MixerProvider;

public class MixerProvider_2 {
    public static void main(String[] args) {
        Mixer.Info[] mixerInfo = AudioSystem.getMixerInfo();
        MixerProvider provider = AudioSystem.getMixerProvider(mixerInfo[0]);
        Mixer mixer = provider.getMixer(mixerInfo[0]);
        
        System.out.println("Mixer name: " + mixer.getMixerInfo().getName());
    }
}
