import java.util.zip.Inflater;

public class Inflater_19 {
    public static void main(String[] args) {
        Inflater inflater = new Inflater();
        byte[] input = new byte[10];
        byte[] output = new byte[10];
        inflater.setInput(input);
        int totalOut = inflater.getTotalOut();
        System.out.println("Total output: " + totalOut);
    }
}
