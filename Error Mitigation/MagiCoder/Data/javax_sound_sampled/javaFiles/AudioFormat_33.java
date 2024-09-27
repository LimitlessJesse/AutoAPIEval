import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;

public class AudioFormat_33 {
    public static void main(String[] args) {
        AudioFormat format = new AudioFormat(44100, 16, 2, true, false);
        int sampleSizeInBits = format.getSampleSizeInBits();
        System.out.println("Sample size in bits: " + sampleSizeInBits);
    }
}
