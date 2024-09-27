import javax.xml.crypto.dsig.TransformParameterSpec;
import javax.xml.crypto.dsig.TransformService;

public class TransformService_1 {
    public static void main(String[] args) {
        TransformService service = new TransformService();
        TransformParameterSpec params = new TransformParameterSpec();
        service.init(params);
    }
}
