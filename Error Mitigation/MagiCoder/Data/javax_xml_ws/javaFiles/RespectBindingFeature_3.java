import javax.xml.ws.RespectBindingFeature;

public class RespectBindingFeature_3 {
    public static void main(String[] args) {
        RespectBindingFeature feature = new RespectBindingFeature();
        String id = feature.getID();
        System.out.println("ID: " + id);
    }
}
