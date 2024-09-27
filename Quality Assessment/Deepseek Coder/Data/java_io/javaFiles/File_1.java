import java.io.File;
import java.io.IOException;

public class File_1 {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        if (file.canRead()) {
            System.out.println("File is readable");
        } else {
            System.out.println("File is not readable");
        }
    }
}
