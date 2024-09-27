import javax.sound.sampled.AudioFormat;

public class AudioFormat_3 {
    public static void main(String[] args) {
        AudioFormat audioFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, 44100, 16, 2, 4, 44100, true);
        int sampleSizeInBits = audioFormat.getSampleSizeInBits();
        System.out.println("Sample size in bits: " + sampleSizeInBits);
    }
}
