import javax.sound.midi.ShortMessage;

public class ShortMessage_5 {
    public static void main(String[] args) {
        ShortMessage msg = new ShortMessage();
        int data = msg.getData2();
        System.out.println("Data: " + data);
    }
}
