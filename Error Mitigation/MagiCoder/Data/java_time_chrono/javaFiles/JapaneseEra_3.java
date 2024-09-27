import java.time.chrono.JapaneseEra;

public class JapaneseEra_3 {
    public static void main(String[] args) {
        JapaneseEra era = JapaneseEra.HEISEI;
        int eraValue = era.getValue();
        System.out.println("The era value is: " + eraValue);
    }
}
