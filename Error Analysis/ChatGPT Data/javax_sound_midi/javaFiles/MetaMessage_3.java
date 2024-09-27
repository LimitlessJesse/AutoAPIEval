import javax.sound.midi.MetaMessage;

public class MetaMessage_3 {
    public static void main(String[] args) {
        MetaMessage message = new MetaMessage();
        int type = 1; // Example type value
        byte[] data = {0x01, 0x02, 0x03}; // Example byte array data
        int length = data.length; // Example length of data array

        message.setMessage(type, data, length);
        
        // Print out the message
        System.out.println("Type: " + message.getType());
        System.out.print("Data: ");
        for (byte b : message.getData()) {
            System.out.print(Integer.toHexString(b & 0xFF) + " ");
        }
        System.out.println("\nLength: " + message.getLength());
    }
}
