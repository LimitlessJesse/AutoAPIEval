import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;

public class AudioFormat_10 {
    public static void main(String[] args) {
        AudioFormat format = new AudioFormat(44100, 16, 2, true, false);
        float frameRate = format.getFrameRate();
        System.out.println("Frame Rate: " + (frameRate == AudioSystem.NOT_SPECIFIED? "Not Specified" : frameRate));
    }
}
