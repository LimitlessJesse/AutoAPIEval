import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;

public class AudioFormat_30 {
    public static void main(String[] args) {
        AudioFormat format = new AudioFormat(44100, 16, 2, true, false);
        int frameSize = format.getFrameSize();
        System.out.println("Frame size: " + (frameSize == AudioSystem.NOT_SPECIFIED? "not specified" : frameSize));
    }
}
