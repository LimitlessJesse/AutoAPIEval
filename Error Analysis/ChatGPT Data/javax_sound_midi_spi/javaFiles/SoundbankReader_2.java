import javax.sound.midi.Soundbank;
import javax.sound.midi.spi.SoundbankReader;
import java.net.URL;
import java.io.IOException;

public class SoundbankReader_2 {
    public static void main(String[] args) {
        SoundbankReader reader = new SoundbankReader(); // Instantiate the SoundbankReader
        URL url = Main.class.getResource("example_soundbank.sf2"); // Example URL to a soundbank file
        try {
            Soundbank soundbank = reader.getSoundbank(url); // Get the Soundbank from the specified URL
            // Use the soundbank as needed
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
