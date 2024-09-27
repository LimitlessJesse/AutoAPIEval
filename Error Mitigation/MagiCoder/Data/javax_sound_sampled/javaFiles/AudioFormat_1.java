import javax.sound.sampled.AudioFormat;

public class AudioFormat_1 {
    public static void main(String[] args) {
        AudioFormat format = new AudioFormat(44100, 16, 2, true, false);
        AudioFormat.Encoding encoding = format.getEncoding();
        System.out.println("Encoding: " + encoding);
    }
}
