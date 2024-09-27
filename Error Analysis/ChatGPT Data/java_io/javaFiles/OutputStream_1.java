import java.io.*;

public class OutputStream_1 {
    public static void main(String[] args) {
        try {
            OutputStream outputStream = new FileOutputStream("output.txt");
            int b = 65; // ASCII value for character 'A'
            outputStream.write(b);
            outputStream.close();
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
