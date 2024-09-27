import javax.sound.midi.SysexMessage;

public class SysexMessage_4 {
    public static void main(String[] args) {
        SysexMessage message = new SysexMessage();
        int status = 0; // example status value
        byte[] data = new byte[]{0x11, 0x22, 0x33}; // example data
        int length = data.length;
        message.setMessage(status, data, length);
    }
}
