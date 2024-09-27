import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Mixer;

public class AudioSystem_1 {
    public static void main(String[] args) {
        Mixer.Info[] mixerInfos = AudioSystem.getMixerInfo();
        
        for (Mixer.Info info : mixerInfos) {
            System.out.println("Mixer Name: " + info.getName());
            System.out.println("Mixer Description: " + info.getDescription());
            System.out.println("Mixer Vendor: " + info.getVendor());
            System.out.println("--------------------------------------");
        }
    }
}
