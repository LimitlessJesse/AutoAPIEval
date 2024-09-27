import javax.sound.sampled.AudioFormat;

public class AudioFormat_Encoding_3 {
    public static void main(String[] args) {
        AudioFormat.Encoding encoding = AudioFormat.Encoding.PCM_SIGNED;
        int hashCode = encoding.hashCode();
        System.out.println("Hash code value for encoding: " + hashCode);
    }
}
