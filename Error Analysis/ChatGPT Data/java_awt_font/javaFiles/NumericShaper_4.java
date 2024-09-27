import java.awt.font.NumericShaper;

public class NumericShaper_4 {
    public static void main(String[] args) {
        char[] text = {'1', '2', '3'};
        int start = 0;
        int count = 3;

        NumericShaper shaper = NumericShaper.getContextualShaper(NumericShaper.Range.EUROPEAN);
        shaper.shape(text, start, count);

        for(char c : text){
            System.out.print(c + " ");
        }
    }
}
