import javax.sound.sampled.AudioFormat;

public class AudioFormat_3 {
    public static void main(String[] args) {
        AudioFormat audioFormat = new AudioFormat(44100, 16, 2, true, false);
        int sampleSizeInBits = audioFormat.getSampleSizeInBits();
        System.out.println("Sample size in bits: " + sampleSizeInBits);
    }
}
