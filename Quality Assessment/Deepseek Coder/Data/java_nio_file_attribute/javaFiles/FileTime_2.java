import java.nio.file.attribute.FileTime;
import java.time.Instant;

public class FileTime_2 {
    public static void main(String[] args) {
        FileTime fileTime = FileTime.from(Instant.now());
        long millis = fileTime.toMillis();
        System.out.println(millis);
    }
}
