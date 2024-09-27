import java.time.Period;

public class Period_3 {
    public static void main(String[] args) {
        Period period = Period.of(1, 2, 3);
        String periodString = period.toString();
        System.out.println("Period: " + periodString);
    }
}
