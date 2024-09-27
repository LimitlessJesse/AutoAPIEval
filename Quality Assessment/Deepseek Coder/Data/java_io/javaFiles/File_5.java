import java.io.File;

public class File_5 {
    public static void main(String[] args) {
        File file = new File("example.txt");
        String absolutePath = file.getAbsolutePath();
        System.out.println("Absolute path: " + absolutePath);
    }
}
