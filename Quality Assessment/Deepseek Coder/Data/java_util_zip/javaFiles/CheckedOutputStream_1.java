import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.CheckedOutputStream;
import java.util.zip.Checksum;

public class CheckedOutputStream_1 {
    public static void main(String[] args) {
        try {
            // Create a FileOutputStream
            FileOutputStream fos = new FileOutputStream("example.txt");

            // Create a Checksum
            Checksum checksum = new Checksum() {
                private long sum = 0;

                @Override
                public void update(int b) {
                    sum += b;
                }

                @Override
                public long getValue() {
                    return sum;
                }

                @Override
                public void reset() {
                    sum = 0;
                }
            };

            // Create a CheckedOutputStream
            CheckedOutputStream cos = new CheckedOutputStream(fos, checksum);

            // Write to the CheckedOutputStream
            cos.write("Hello, World!".getBytes());

            // Print the checksum
            System.out.println("Checksum: " + checksum.getValue());

            // Close the CheckedOutputStream
            cos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
