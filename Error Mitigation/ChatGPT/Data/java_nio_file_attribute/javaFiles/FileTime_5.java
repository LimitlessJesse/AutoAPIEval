import java.nio.file.attribute.FileTime;

public class FileTime_5 {
    public static void main(String[] args) {
        FileTime fileTime = FileTime.fromMillis(1234567890000L);
        System.out.println(fileTime.toString());
    }
}
