import java.io.File;
import java.io.IOException;

public class File_2 {
    public static void main(String[] args) {
        File file = new File("test.txt");
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

        if (file.canWrite()) {
            System.out.println("The application can write to the file.");
        } else {
            System.out.println("The application cannot write to the file.");
        }
    }
}
