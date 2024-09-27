import java.nio.file.attribute.FileTime;

public class FileTime_4 {
    public static void main(String[] args) {
        FileTime fileTime1 = FileTime.fromMillis(System.currentTimeMillis());
        FileTime fileTime2 = FileTime.fromMillis(System.currentTimeMillis() - 1000000);

        int comparisonResult = fileTime1.compareTo(fileTime2);
        if (comparisonResult < 0) {
            System.out.println("fileTime1 is earlier than fileTime2");
        } else if (comparisonResult > 0) {
            System.out.println("fileTime1 is later than fileTime2");
        } else {
            System.out.println("fileTime1 is equal to fileTime2");
        }
    }
}
