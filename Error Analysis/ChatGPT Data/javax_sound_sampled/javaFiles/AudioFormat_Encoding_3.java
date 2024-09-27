import javax.sound.sampled.AudioFormat.Encoding;

public class AudioFormat_Encoding_3 {
    public static void main(String[] args) {
        Encoding encoding = new Encoding("PCM_SIGNED");
        System.out.println(encoding.toString());
    }
}
