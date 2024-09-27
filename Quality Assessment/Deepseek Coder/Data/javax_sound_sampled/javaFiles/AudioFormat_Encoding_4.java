import javax.sound.sampled.AudioFormat;

public class AudioFormat_Encoding_4 {
    public static void main(String[] args) {
        AudioFormat.Encoding encoding = new AudioFormat.Encoding("PCM_SIGNED");
        int hashCode = encoding.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
