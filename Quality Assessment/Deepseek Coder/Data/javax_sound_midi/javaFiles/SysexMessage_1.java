import javax.sound.midi.SysexMessage;

public class SysexMessage_1 {
    public static void main(String[] args) {
        // Create a SysexMessage
        SysexMessage sysexMessage = new SysexMessage(new byte[]{0x41, 0x01, 0x02, 0x03}, 0, 4);

        // Get the data from the SysexMessage
        byte[] data = sysexMessage.getData();

        // Print the data
        for (byte b : data) {
            System.out.printf("0x%02X ", b);
        }
        System.out.println();
    }
}
