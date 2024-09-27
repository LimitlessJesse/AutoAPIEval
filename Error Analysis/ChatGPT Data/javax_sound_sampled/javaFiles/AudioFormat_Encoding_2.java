import javax.sound.sampled.AudioFormat;

public class AudioFormat_Encoding_2 {
    public static void main(String[] args) {
        AudioFormat.Encoding encoding = AudioFormat.Encoding.PCM_SIGNED;
        int hashCode = encoding.hashCode();
        System.out.println("HashCode of the encoding: " + hashCode);
    }
}
