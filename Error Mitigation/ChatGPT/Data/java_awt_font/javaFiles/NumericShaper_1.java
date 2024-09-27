import java.awt.font.NumericShaper;

public class NumericShaper_1 {
    public static void main(String[] args) {
        int ranges = NumericShaper.ARABIC | NumericShaper.THAI;
        NumericShaper shaper = NumericShaper.getContextualShaper(ranges);
        // Now you can use the 'shaper' object to shape digits based on the specified ranges
    }
}
