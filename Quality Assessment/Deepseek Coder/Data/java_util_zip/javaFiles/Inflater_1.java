import java.util.zip.Inflater;

public class Inflater_1 {
    public static void main(String[] args) {
        try {
            // Create an Inflater instance
            Inflater inflater = new Inflater();

            // Create a byte array
            byte[] buffer = new byte[]{1, 2, 3, 4, 5};

            // Set the input
            inflater.setInput(buffer, 0, buffer.length);

            // Perform the inflation
            byte[] output = new byte[1024];
            int result = inflater.inflate(output);

            // Print the result
            System.out.println("Number of bytes inflated: " + result);
            System.out.println("Inflated data: " + new String(output, 0, result, "UTF-8"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
