import java.util.zip.Inflater;
import java.util.zip.DataFormatException;

public class Inflater_3 {
    public static void main(String[] args) {
        byte[] input = new byte[1024]; // replace with your input data
        byte[] output = new byte[1024]; // replace with your output buffer

        Inflater inflater = new Inflater();
        try {
            inflater.setInput(input);
            int result = inflater.inflate(output);
            System.out.println("Inflated: " + result + " bytes");
        } catch (DataFormatException e) {
            e.printStackTrace();
        } finally {
            inflater.end();
        }
    }
}
