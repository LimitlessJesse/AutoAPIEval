import java.nio.file.attribute.FileTime;
import java.util.concurrent.TimeUnit;

public class FileTime_2 {
    public static void main(String[] args) {
        long value = 1000;
        TimeUnit unit = TimeUnit.MILLISECONDS;
        
        FileTime fileTime = FileTime.from(value, unit);
        System.out.println(fileTime);
    }
}
