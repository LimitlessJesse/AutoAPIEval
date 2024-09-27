import javax.sound.sampled.AudioFormat;

public class AudioFormat_1 {
    public static void main(String[] args) {
        AudioFormat audioFormat = new AudioFormat(44100, 16, 2, true, false);
        int channels = audioFormat.getChannels();
        System.out.println("Number of channels: " + channels);
    }
}
