import javax.sound.sampled.AudioFormat;

public class AudioFormat_4 {
    public static void main(String[] args) {
        AudioFormat audioFormat = new AudioFormat(44100, 16, 2, true, false);
        boolean isBigEndian = audioFormat.isBigEndian();
        System.out.println("Is Big Endian: " + isBigEndian);
    }
}
