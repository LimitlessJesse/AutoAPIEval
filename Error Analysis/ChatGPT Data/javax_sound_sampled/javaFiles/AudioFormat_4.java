import javax.sound.sampled.*;

public class AudioFormat_4 {
    public static void main(String[] args) {
        AudioFormat audioFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, 44100, 16, 2, 4, 44100, false);
        boolean isBigEndian = audioFormat.isBigEndian();
        System.out.println("Is Big Endian: " + isBigEndian);
    }
}
