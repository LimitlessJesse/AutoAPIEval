import java.util.zip.Inflater;

public class Inflater_4 {
    public static void main(String[] args) {
        Inflater inflater = new Inflater();
        byte[] input = new byte[1024];
        inflater.setInput(input);
        int remaining = inflater.getRemaining();
        System.out.println("Remaining bytes: " + remaining);
    }
}
