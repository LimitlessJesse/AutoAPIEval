import java.time.format.DateTimeFormatter;

public class DateTimeFormatter_1 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM uuuu");
        String formattedDate = formatter.format(LocalDate.parse("2011-12-03"));
        System.out.println(formattedDate); // Output: 3 Dec 2011
    }
}
