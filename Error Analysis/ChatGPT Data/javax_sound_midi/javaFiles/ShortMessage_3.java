import javax.sound.midi.ShortMessage;

public class ShortMessage_3 {
    public static void main(String[] args) {
        ShortMessage message = new ShortMessage();
        int data2 = message.getData2();
        System.out.println("Data2: " + data2);
    }
}
