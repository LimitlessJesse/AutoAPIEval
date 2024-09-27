import javax.sound.midi.ShortMessage;

public class ShortMessage_2 {
    public static void main(String[] args) {
        ShortMessage msg = new ShortMessage();
        int data = msg.getData1();
        System.out.println("Data1: " + data);
    }
}
