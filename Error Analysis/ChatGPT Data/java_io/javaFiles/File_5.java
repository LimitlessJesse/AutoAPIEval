import java.io.File;

public class File_5 {
    public static void main(String[] args) {
        File file = new File("example.txt");

        // Get the length of the file in bytes
        long fileSize = file.length();
        System.out.println("File size (in bytes): " + fileSize);
    }
}
