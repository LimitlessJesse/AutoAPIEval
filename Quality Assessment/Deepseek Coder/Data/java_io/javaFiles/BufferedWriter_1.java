import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_1 {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write('H'); // writes the character 'H' to the file
            writer.write('e'); // writes the character 'e' to the file
            writer.write('l'); // writes the character 'l' to the file
            writer.write('o'); // writes the character 'o' to the file
            writer.close(); // closes the writer
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
