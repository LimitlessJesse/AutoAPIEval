import org.xml.sax.helpers.ParserAdapter;

public class ParserAdapter_5 {
    public static void main(String[] args) {
        // Create a char array
        char[] arr = {'a', 'b', 'c', 'd', 'e'};

        // Call void characters method from ParserAdapter
        ParserAdapter parserAdapter = new ParserAdapter();
        parserAdapter.characters(arr, 1, 3);
    }
}
