import javax.xml.stream.util.StreamReaderDelegate;

public class StreamReaderDelegate_2 {
    public static void main(String[] args) {
        // Sample XML content
        String xmlContent = "<root><child>Hello</child></root>";

        // Create a StreamReaderDelegate
        StreamReaderDelegate reader = new StreamReaderDelegate() {
            @Override
            public String getNamespaceURI(String prefix) {
                return "http://example.com/" + prefix;
            }
        };

        // Set the XML content for the reader
        reader.setInput(new StringReader(xmlContent));

        // Use the getNamespaceURI method
        String namespaceURI = reader.getNamespaceURI("prefix");

        System.out.println("Namespace URI: " + namespaceURI);
    }
}
