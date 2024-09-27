import java.io.*;

public class OutputStreamWriter_5 {
    public static void main(String[] args) {
        OutputStreamWriter writer = null;
        try {
            writer = new OutputStreamWriter(new FileOutputStream("output.txt"));
            writer.write("Hello, World!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
