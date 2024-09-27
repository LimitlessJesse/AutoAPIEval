import java.time.Period;

public class Period_2 {
    public static void main(String[] args) {
        String text = "P2Y";
        Period period = Period.parse(text);
        System.out.println(period);
    }
}
