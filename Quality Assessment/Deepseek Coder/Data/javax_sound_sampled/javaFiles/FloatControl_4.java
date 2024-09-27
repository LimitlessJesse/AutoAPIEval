import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;

public class FloatControl_4 {
    public static void main(String[] args) {
        try {
            Clip clip = AudioSystem.getClip();
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            float maxGain = gainControl.getMaximum();
            System.out.println("Maximum Gain: " + maxGain);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
