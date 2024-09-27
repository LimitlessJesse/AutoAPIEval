import javax.sound.sampled.AudioInputStream;
import java.io.IOException;

public class AudioInputStream_2 {
    public static void main(String[] args) {
        AudioInputStream audioInputStream = new AudioInputStream(); // Create an instance of AudioInputStream
        try {
            int bytesAvailable = audioInputStream.available(); // Get the number of bytes available
            System.out.println("Bytes available: " + bytesAvailable);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
