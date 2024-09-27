import java.util.zip.Inflater;

public class Inflater_3 {
    public static void main(String[] args) {
        try {
            // Create a byte array
            byte[] input = new byte[]{1, 2, 3, 4, 5};

            // Create an Inflater object
            Inflater inflater = new Inflater();

            // Set the input data
            inflater.setInput(input);

            // Create a byte array for the output
            byte[] output = new byte[10];

            // Inflate the data
            int result = inflater.inflate(output);

            // Print the result and the output
            System.out.println("Result: " + result);
            System.out.println("Output: " + new String(output));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
