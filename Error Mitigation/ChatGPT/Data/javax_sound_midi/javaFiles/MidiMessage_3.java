import javax.sound.midi.MidiMessage;

public class MidiMessage_3 {
    public static void main(String[] args) {
        // Create a MidiMessage object
        MidiMessage midiMessage = new MidiMessage() {
            @Override
            public byte[] getMessage() {
                // Simulate getting MIDI message data
                byte[] messageData = {0x90, 0x40, 0x7F}; // Example MIDI message data
                return messageData;
            }
        };

        // Get the MIDI message data
        byte[] message = midiMessage.getMessage();

        // Print the MIDI message data
        for (byte b : message) {
            System.out.print(b + " ");
        }
    }
}
