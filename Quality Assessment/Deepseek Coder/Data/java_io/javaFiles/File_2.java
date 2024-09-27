import java.io.File;

public class File_2 {
    public static void main(String[] args) {
        File file = new File("example.txt");
        boolean canWrite = file.setWritable(true);
        System.out.println("Can write: " + canWrite);
    }
}
