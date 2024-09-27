import org.xml.sax.InputSource;
import org.xml.sax.helpers.ParserAdapter;

import java.io.StringReader;

public class ParserAdapter_1 {
    public static void main(String[] args) {
        ParserAdapter parserAdapter = new ParserAdapter();
        String xml = "<root>Hello World</root>";
        InputSource inputSource = new InputSource(new StringReader(xml));
        parserAdapter.parse(inputSource);
    }
}
