import javax.sound.sampled.AudioFormat;

public class AudioFormat_2 {
    public static void main(String[] args) {
        // Create an AudioFormat object
        AudioFormat format = new AudioFormat(44100, 16, 2, true, false);
        
        // Get the sample size in bits
        int sampleSizeInBits = format.getSampleSizeInBits();
        
        // Print the sample size in bits
        System.out.println("Sample size in bits: " + sampleSizeInBits);
    }
}
