import java.time.Period;

public class Period_5 {
    public static void main(String[] args) {
        Period period = Period.of(1, 2, 3);
        int months = period.getMonths();
        System.out.println("Months: " + months);
    }
}
