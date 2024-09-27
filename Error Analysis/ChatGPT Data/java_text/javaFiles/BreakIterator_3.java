import java.text.BreakIterator;

public class BreakIterator_3 {
    public static void main(String[] args) {
        String text = "Hello World. This is a sample text.";
        
        BreakIterator iterator = BreakIterator.getWordInstance();
        iterator.setText(text);
        
        int start = iterator.first();
        int end = iterator.next();
        
        while (end != BreakIterator.DONE) {
            String word = text.substring(start, end);
            System.out.println(word);
            start = end;
            end = iterator.next();
        }
    }
}
