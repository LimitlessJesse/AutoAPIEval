import java.io.File;

public class File_5 {
    public static void main(String[] args) {
        File file = new File("example.txt");
        boolean fileExists = file.exists();
        System.out.println("File exists: " + fileExists);
    }
}
