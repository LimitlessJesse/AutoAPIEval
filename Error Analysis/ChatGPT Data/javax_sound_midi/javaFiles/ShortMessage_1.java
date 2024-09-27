import javax.sound.midi.ShortMessage;

public class ShortMessage_1 {
    public static void main(String[] args) {
        ShortMessage message = new ShortMessage();
        int channel = message.getChannel();
        System.out.println("Channel: " + channel);
    }
}
