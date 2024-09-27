import java.awt.font.NumericShaper;

public class NumericShaper_5 {
    public static void main(String[] args) {
        NumericShaper shaper = NumericShaper.getContextualShaper(NumericShaper.TRADITIONAL);
        System.out.println("Contextual shaper initialized with context: " + shaper);
    }
}
