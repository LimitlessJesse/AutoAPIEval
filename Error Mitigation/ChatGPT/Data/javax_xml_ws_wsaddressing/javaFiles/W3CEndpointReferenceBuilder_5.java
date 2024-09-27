import javax.xml.ws.wsaddressing.W3CEndpointReferenceBuilder;
import javax.xml.ws.wsaddressing.W3CEndpointReference;

public class W3CEndpointReferenceBuilder_5 {
    public static void main(String[] args) {
        W3CEndpointReferenceBuilder builder = new W3CEndpointReferenceBuilder();
        builder.address("http://example.com/service")
                .serviceName("ServiceName")
                .endpointName("EndpointName");
        
        W3CEndpointReference endpointReference = builder.build();
        System.out.println(endpointReference);
    }
}
