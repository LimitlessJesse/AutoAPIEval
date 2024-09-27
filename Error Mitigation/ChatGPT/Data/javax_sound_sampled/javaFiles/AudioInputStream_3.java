import javax.sound.sampled.AudioInputStream;
import java.io.IOException;

public class AudioInputStream_3 {
    public static void main(String[] args) {
        AudioInputStream audioInputStream = new AudioInputStream(); // create an instance of AudioInputStream
        long bytesSkipped;
        try {
            bytesSkipped = audioInputStream.skip(10); // skip 10 bytes
            System.out.println("Bytes skipped: " + bytesSkipped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
