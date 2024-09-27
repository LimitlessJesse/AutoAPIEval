import javax.sound.midi.Soundbank;
import javax.sound.midi.spi.SoundbankReader;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.ServiceLoader;

public class SoundbankReader_3 {
    public static void main(String[] args) {
        File soundbankFile = new File("example.sf2");
        Soundbank soundbank = null;

        ServiceLoader<SoundbankReader> serviceLoader = ServiceLoader.load(SoundbankReader.class);
        Iterator<SoundbankReader> iterator = serviceLoader.iterator();

        while (iterator.hasNext()) {
            SoundbankReader reader = iterator.next();
            try {
                soundbank = reader.getSoundbank(soundbankFile);
                if (soundbank != null) {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (soundbank != null) {
            System.out.println("Soundbank loaded successfully: " + soundbank);
        } else {
            System.out.println("Failed to load Soundbank");
        }
    }
}
