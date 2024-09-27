import java.time.Period;

public class Period_4 {
    public static void main(String[] args) {
        Period period = Period.of(2, -3, 4);
        Period multipliedPeriod = period.multipliedBy(3);
        System.out.println(multipliedPeriod);
    }
}
