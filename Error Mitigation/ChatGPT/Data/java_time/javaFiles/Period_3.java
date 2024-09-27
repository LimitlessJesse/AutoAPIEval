import java.time.Period;

public class Period_3 {
    public static void main(String[] args) {
        Period period = Period.of(2, 3, 4);
        System.out.println("Period: " + period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days");
    }
}
