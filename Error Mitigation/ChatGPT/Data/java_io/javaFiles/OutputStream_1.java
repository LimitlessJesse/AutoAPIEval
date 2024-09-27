import java.io.*;

public class OutputStream_1 {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("output.txt");
            os.write(65); // writes the ASCII value of 'A' to the output stream
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
