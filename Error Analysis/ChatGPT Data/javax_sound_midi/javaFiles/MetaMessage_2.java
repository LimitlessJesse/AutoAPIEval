import javax.sound.midi.MetaMessage;

public class MetaMessage_2 {
    public static void main(String[] args) {
        MetaMessage metaMessage = new MetaMessage();
        byte[] data = metaMessage.getData();

        // Example usage of byte[] data
        for (byte b : data) {
            System.out.print(b + " ");
        }
    }
}
