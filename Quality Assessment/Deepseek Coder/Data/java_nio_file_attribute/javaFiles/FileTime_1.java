import java.nio.file.attribute.FileTime;
import java.time.Instant;

public class FileTime_1 {
    public static void main(String[] args) {
        long millis = System.currentTimeMillis();
        FileTime fileTime = FileTime.from(Instant.ofEpochMilli(millis));
        System.out.println(fileTime);
    }
}
