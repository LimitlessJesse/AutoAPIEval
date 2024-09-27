import javax.sound.sampled.AudioFormat;

public class AudioFormat_Encoding_1 {
    public static void main(String[] args) {
        AudioFormat.Encoding encoding = AudioFormat.Encoding.PCM_SIGNED;
        System.out.println(encoding.toString());
    }
}
