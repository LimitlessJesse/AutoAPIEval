import javax.sound.midi.MetaMessage;
import javax.sound.midi.ShortMessage;

public class MetaMessage_3 {
    public static void main(String[] args) {
        try {
            // Create a MetaMessage
            MetaMessage metaMessage = new MetaMessage();
            metaMessage.setMessage(new ShortMessage(ShortMessage.NOTE_ON, 0, 64, 100).getMessage());

            // Get the data from the MetaMessage
            byte[] data = metaMessage.getData();

            // Print the data
            for (byte b : data) {
                System.out.print(b + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
