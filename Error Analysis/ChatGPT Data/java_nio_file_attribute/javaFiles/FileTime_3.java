import java.nio.file.attribute.FileTime;
import java.time.Instant;

public class FileTime_3 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        FileTime fileTime = FileTime.from(instant);
        System.out.println(fileTime.toString());
    }
}
