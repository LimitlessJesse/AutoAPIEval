import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;
import javax.sound.midi.SysexMessage;

public class SysexMessage_2 {
    public static void main(String[] args) {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            byte[] data = {(byte) 0xF0, (byte) 0x41, (byte) 0x10, (byte) 0x42, (byte) 0x12, (byte) 0x40, (byte) 0x00, (byte) 0x7F, (byte) 0x00, (byte) 0x41, (byte) 0xF7};
            SysexMessage sysexMessage = new SysexMessage(data, 0);

            byte[] sysexData = sysexMessage.getData();

            for (byte b : sysexData) {
                System.out.printf("%02X ", b);
            }

            sequencer.close();
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }
}
