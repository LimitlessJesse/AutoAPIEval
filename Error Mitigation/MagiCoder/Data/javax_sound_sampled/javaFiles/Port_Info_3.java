import javax.sound.sampled.*;

public class Port_Info_3 {
    public static void main(String[] args) {
        try {
            Mixer.Info[] mixerInfo = AudioSystem.getMixerInfo();
            for (Mixer.Info info : mixerInfo) {
                Mixer mixer = AudioSystem.getMixer(info);
                Port.Info[] portInfo = mixer.getSourceLineInfo();
                for (Port.Info port : portInfo) {
                    System.out.println("Port name: " + port.getName());
                    System.out.println("Is source: " + port.isSource());
                }
            }
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}
