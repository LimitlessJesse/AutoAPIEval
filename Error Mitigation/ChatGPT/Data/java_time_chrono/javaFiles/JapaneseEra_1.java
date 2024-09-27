import java.time.chrono.JapaneseEra;

public class JapaneseEra_1 {
    public static void main(String[] args) {
        JapaneseEra era = JapaneseEra.SHOWA;
        int eraValue = era.getValue();
        System.out.println("The era value for SHOWA is: " + eraValue);
    }
}
