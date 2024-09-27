import java.nio.file.attribute.FileTime;
import java.util.Date;

public class FileTime_2 {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        FileTime fileTime = FileTime.fromMillis(currentTimeMillis);
        System.out.println("File time created from current time in millis: " + fileTime.toString());
    }
}
