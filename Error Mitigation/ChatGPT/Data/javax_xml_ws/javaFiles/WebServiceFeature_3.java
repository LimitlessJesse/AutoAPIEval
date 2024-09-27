import javax.xml.ws.WebServiceFeature;

public class WebServiceFeature_3 {
    public static void main(String[] args) {
        WebServiceFeature feature = new WebServiceFeature();
        boolean enabled = feature.isEnabled();
        System.out.println("Is feature enabled? " + enabled);
    }
}
