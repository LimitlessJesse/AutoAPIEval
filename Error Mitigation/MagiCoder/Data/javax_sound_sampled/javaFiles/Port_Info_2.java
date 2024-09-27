import javax.sound.sampled.*;

public class Port_Info_2 {
    public static void main(String[] args) {
        try {
            Mixer.Info[] mixerInfo = AudioSystem.getMixerInfo();
            for (Mixer.Info info : mixerInfo) {
                Mixer mixer = AudioSystem.getMixer(info);
                Port.Info[] portInfo = mixer.getSourceLineInfo();
                for (Port.Info port : portInfo) {
                    System.out.println("Port Name: " + port.getName());
                }
            }
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}
