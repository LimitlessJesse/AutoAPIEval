import java.util.zip.Inflater;

public class Inflater_2 {
    public static void main(String[] args) {
        try {
            // Create an Inflater instance
            Inflater inflater = new Inflater();

            // Create a byte array
            byte[] buffer = { 0x12, 0x34, 0x56, 0x78 };

            // Set the input for the Inflater
            inflater.setInput(buffer);

            // Print the inflater
            System.out.println(inflater);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
