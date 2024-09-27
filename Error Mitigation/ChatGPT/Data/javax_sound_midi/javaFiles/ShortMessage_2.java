import javax.sound.midi.ShortMessage;

public class ShortMessage_2 {
    public static void main(String[] args) {
        ShortMessage message = new ShortMessage();
        int command = message.getCommand();
        System.out.println("MIDI Command: " + command);
    }
}
