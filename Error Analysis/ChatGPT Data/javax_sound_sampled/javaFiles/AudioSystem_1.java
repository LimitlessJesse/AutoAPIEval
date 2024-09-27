import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Mixer;

public class AudioSystem_1 {
    public static void main(String[] args) {
        Mixer.Info[] mixerInfos = AudioSystem.getMixerInfo();
        
        for (Mixer.Info mixerInfo : mixerInfos) {
            System.out.println("Mixer Name: " + mixerInfo.getName());
            System.out.println("Mixer Description: " + mixerInfo.getDescription());
            System.out.println("Mixer Vendor: " + mixerInfo.getVendor());
            System.out.println("---------------------------------------");
        }
    }
}
