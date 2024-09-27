import java.awt.font.NumericShaper;

public class NumericShaper_2 {
    public static void main(String[] args) {
        NumericShaper shaper = NumericShaper.getContextualShaper(NumericShaper.ARABIC);
        int ranges = shaper.getRanges();
        System.out.println("Ranges to be shaped: " + ranges);
    }
}
