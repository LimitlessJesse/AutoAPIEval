import java.nio.file.attribute.FileTime;

public class FileTime_3 {
    public static void main(String[] args) {
        FileTime time1 = FileTime.fromMillis(System.currentTimeMillis());
        FileTime time2 = FileTime.fromMillis(System.currentTimeMillis());

        boolean result = time1.equals(time2);
        System.out.println("Are the FileTimes equal? " + result);
    }
}
