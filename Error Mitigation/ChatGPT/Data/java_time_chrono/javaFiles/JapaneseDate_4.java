import java.time.chrono.JapaneseDate;

public class JapaneseDate_4 {
    public static void main(String[] args) {
        JapaneseDate date = JapaneseDate.now();
        int lengthOfMonth = date.lengthOfMonth();
        System.out.println("Length of the month: " + lengthOfMonth);
    }
}
