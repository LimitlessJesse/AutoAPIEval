import javax.sound.sampled.*;
import java.io.IOException;

public class AudioInputStream_2 {
    public static void main(String[] args) {
        try {
            // Create a new AudioFormat
            AudioFormat format = new AudioFormat(44100, 16, 2, true, false);

            // Create a new AudioInputStream
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(format);

            // Create a byte array
            byte[] buffer = new byte[1024];

            // Read data from the AudioInputStream
            int bytesRead = audioInputStream.read(buffer, 0, buffer.length);

            // Print the number of bytes read
            System.out.println("Bytes read: " + bytesRead);

            // Close the AudioInputStream
            audioInputStream.close();
        } catch (UnsupportedAudioFileException | IOException e) {
            e.printStackTrace();
        }
    }
}
