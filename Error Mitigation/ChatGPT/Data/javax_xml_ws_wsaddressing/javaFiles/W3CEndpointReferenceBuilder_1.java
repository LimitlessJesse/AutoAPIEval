import javax.xml.ws.wsaddressing.W3CEndpointReferenceBuilder;

public class W3CEndpointReferenceBuilder_1 {
    public static void main(String[] args) {
        W3CEndpointReferenceBuilder builder = new W3CEndpointReferenceBuilder();
        String address = "http://example.com/service";
        builder.address(address);
    }
}
