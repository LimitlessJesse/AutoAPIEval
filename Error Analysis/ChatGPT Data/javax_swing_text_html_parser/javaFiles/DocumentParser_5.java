import javax.swing.text.html.parser.DocumentParser;

public class DocumentParser_5 {
    public static void main(String[] args) {
        // Usage of the handleError method from DocumentParser
        DocumentParser parser = new DocumentParser();
        int position = 10; // Example position
        String errorMessage = "Error message";
        parser.handleError(position, errorMessage);
    }
}
