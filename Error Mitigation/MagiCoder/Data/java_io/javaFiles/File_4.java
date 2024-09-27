import java.io.File;
import java.io.IOException;

public class File_4 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try {
            file.createNewFile();
            System.out.println("File created: " + file.delete());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
