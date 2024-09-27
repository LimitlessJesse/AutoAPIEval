import javax.sound.sampled.AudioFormat;

public class AudioFormat_5 {
    public static void main(String[] args) {
        AudioFormat format = new AudioFormat(44100, 16, 2, true, false);
        boolean isBigEndian = format.isBigEndian();
        System.out.println("Is the audio data stored in big-endian byte order? " + isBigEndian);
    }
}
