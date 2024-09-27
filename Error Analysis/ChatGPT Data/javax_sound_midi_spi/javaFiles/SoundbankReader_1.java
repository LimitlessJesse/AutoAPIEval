import javax.sound.midi.Soundbank;
import javax.sound.midi.spi.SoundbankReader;
import java.io.InputStream;
import java.io.IOException;

public class SoundbankReader_1 {
    public static void main(String[] args) {
        SoundbankReader soundbankReader = new com.sun.media.sound.SF2SoundbankReader();

        try {
            InputStream inputStream = Main.class.getResourceAsStream("exampleSoundbank.sf2");
            Soundbank soundbank = soundbankReader.getSoundbank(inputStream);

            // Use the soundbank object here
            System.out.println("Loaded soundbank: " + soundbank);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
