import javax.sound.sampled.AudioInputStream;
import java.io.IOException;

public class AudioInputStream_1 {
    public static void main(String[] args) {
        AudioInputStream audioInputStream = new AudioInputStream(); // create an instance of AudioInputStream
        
        byte[] buffer = new byte[1024]; // create a byte array buffer
        int offset = 0; // set the offset
        int length = buffer.length; // set the length
        
        try {
            int bytesRead = audioInputStream.read(buffer, offset, length); // read data from the audio input stream
            System.out.println("Bytes read: " + bytesRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
