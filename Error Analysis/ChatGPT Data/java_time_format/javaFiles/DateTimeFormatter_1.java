import java.time.format.DateTimeFormatter;

public class DateTimeFormatter_1 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dateTime = "2022-09-15 14:30:00";
        System.out.println(LocalDateTime.parse(dateTime, formatter));
    }
}
