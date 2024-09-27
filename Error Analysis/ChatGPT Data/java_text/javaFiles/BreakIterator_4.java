import java.text.BreakIterator;

public class BreakIterator_4 {
    public static void main(String[] args) {
        String text = "Hello! How are you?";
        BreakIterator iterator = BreakIterator.getWordInstance();
        iterator.setText(text);

        int end = iterator.first();
        int start = iterator.next();
        while (start != BreakIterator.DONE) {
            String word = text.substring(end, start);
            System.out.println(word);
            end = start;
            start = iterator.next();
        }
    }
}
