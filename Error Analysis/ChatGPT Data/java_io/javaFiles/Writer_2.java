import java.io.FileWriter;
import java.io.IOException;

public class Writer_2 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            char[] text = {'H', 'e', 'l', 'l', 'o'};
            writer.write(text, 0, 5);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
