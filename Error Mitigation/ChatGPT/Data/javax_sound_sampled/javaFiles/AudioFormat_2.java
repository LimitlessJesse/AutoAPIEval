import javax.sound.sampled.AudioFormat;

public class AudioFormat_2 {
    public static void main(String[] args) {
        AudioFormat audioFormat = new AudioFormat(44100, 16, 2, true, false);
        float sampleRate = audioFormat.getSampleRate();
        System.out.println("Sample Rate: " + sampleRate);
    }
}
