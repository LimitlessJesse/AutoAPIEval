import java.nio.file.attribute.FileTime;
import java.util.concurrent.TimeUnit;

public class FileTime_1 {
    public static void main(String[] args) {
        FileTime fileTime = FileTime.fromMillis(System.currentTimeMillis());
        long value = fileTime.to(TimeUnit.SECONDS);
        System.out.println("File time in seconds since epoch: " + value);
    }
}
