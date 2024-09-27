import java.nio.file.attribute.FileTime;
import java.time.Instant;

public class FileTime_5 {
    public static void main(String[] args) {
        FileTime fileTime = FileTime.fromMillis(System.currentTimeMillis());
        Instant instant = fileTime.toInstant(); 
        System.out.println("Instant: " + instant);
    }
}
