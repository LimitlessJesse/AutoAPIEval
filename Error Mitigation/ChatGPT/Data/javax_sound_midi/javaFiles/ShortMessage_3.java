import javax.sound.midi.ShortMessage;

public class ShortMessage_3 {
    public static void main(String[] args) {
        ShortMessage message = new ShortMessage();
        try {
            message.setMessage(ShortMessage.NOTE_ON, 0, 60);
            int data1 = message.getData1();
            System.out.println("Data1: " + data1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
