import java.nio.file.attribute.FileTime;

public class FileTime_4 {
    public static void main(String[] args) {
        FileTime time1 = FileTime.fromMillis(System.currentTimeMillis());
        FileTime time2 = FileTime.fromMillis(System.currentTimeMillis() + 1000);
        
        int comparison = time1.compareTo(time2);
        
        if(comparison == 0) {
            System.out.println("Both times are equal");
        } else if(comparison < 0) {
            System.out.println("time1 is before time2");
        } else {
            System.out.println("time1 is after time2");
        }
    }
}
