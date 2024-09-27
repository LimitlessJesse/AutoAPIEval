import java.time.Period;

public class Period_4 {
    public static void main(String[] args) {
        Period period = Period.of(2, 6, 15);
        int years = period.getYears();
        System.out.println("Years: " + years);
    }
}
