import java.time.chrono.JapaneseDate;

public class JapaneseDate_1 {
    public static void main(String[] args) {
        JapaneseDate japaneseDate = JapaneseDate.now();
        int length = japaneseDate.lengthOfMonth();
        System.out.println("Length of month: " + length);
    }
}
