import javax.sound.sampled.*;

public class AudioSystem_2 {
    public static void main(String[] args) {
        Mixer.Info[] mixerInfo = AudioSystem.getMixerInfo();
        
        for (Mixer.Info info : mixerInfo) {
            Mixer mixer = AudioSystem.getMixer(info);
            System.out.println("Mixer: " + mixer.getMixerInfo().getName());
        }
    }
}
