import javax.sound.sampled.AudioFormat;

public class AudioFormat_4 {
    public static void main(String[] args) {
        AudioFormat format = new AudioFormat(44100, 16, 2, true, false);
        boolean isBigEndian = format.isBigEndian();
        System.out.println("Is Big Endian: " + isBigEndian);
    }
}
