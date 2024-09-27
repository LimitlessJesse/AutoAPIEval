import java.util.zip.Inflater;

public class Inflater_5 {
    public static void main(String[] args) {
        Inflater inflater = new Inflater();
        byte[] input = new byte[100];
        inflater.setInput(input);
        inflater.inflate(new byte[50]);
        int remaining = inflater.getRemaining();
        System.out.println("Remaining bytes in input buffer: " + remaining);
    }
}
