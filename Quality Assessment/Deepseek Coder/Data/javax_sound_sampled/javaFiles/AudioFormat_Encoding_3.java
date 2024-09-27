import javax.sound.sampled.AudioFormat;

public class AudioFormat_Encoding_3 {
    public static void main(String[] args) {
        AudioFormat.Encoding encoding1 = AudioFormat.Encoding.PCM_SIGNED;
        AudioFormat.Encoding encoding2 = AudioFormat.Encoding.PCM_SIGNED;

        boolean isEqual = encoding1.equals(encoding2);

        System.out.println("Are the two AudioFormat.Encoding objects equal? " + isEqual);
    }
}
