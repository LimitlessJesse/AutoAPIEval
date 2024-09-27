import javax.sound.sampled.AudioFormat;

public class AudioFormat_Encoding_1 {
    public static void main(String[] args) {
        AudioFormat.Encoding encoding1 = new AudioFormat.Encoding("Encoding1");
        AudioFormat.Encoding encoding2 = new AudioFormat.Encoding("Encoding2");

        boolean isEqual = encoding1.equals(encoding2);
        System.out.println("Are the encodings equal? " + isEqual);
    }
}
