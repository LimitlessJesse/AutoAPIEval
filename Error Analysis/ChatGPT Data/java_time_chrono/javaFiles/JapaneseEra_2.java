import java.time.chrono.JapaneseEra;

public class JapaneseEra_2 {
    public static void main(String[] args) {
        JapaneseEra era = JapaneseEra.of(4);
        int value = era.getValue();
        System.out.println("Value of Japanese Era: " + value);
    }
}
