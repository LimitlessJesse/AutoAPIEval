import javax.sound.sampled.*;

public class Mixer_Info_1 {
    public static void main(String[] args) {
        Mixer.Info mixerInfo = AudioSystem.getMixerInfo()[0];
        String description = mixerInfo.getDescription();
        System.out.println(description);
    }
}
