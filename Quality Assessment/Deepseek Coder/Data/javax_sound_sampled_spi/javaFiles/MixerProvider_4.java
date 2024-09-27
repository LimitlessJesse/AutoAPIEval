import javax.sound.sampled.Mixer;
import javax.sound.sampled.spi.MixerProvider;
import java.util.prefs.Preferences;

public class MixerProvider_4 {
    public static void main(String[] args) {
        Preferences.userRoot().put("javax.sound.sampled.FloatControl.volumeScale", "1.0");
        Mixer.Info[] mixerInfo = Mixer.Info.getMixerInfos();
        for (Mixer.Info info : mixerInfo) {
            Mixer m = MixerProvider.getMixer(info);
            System.out.println(m.getMixerInfo());
        }
    }
}
