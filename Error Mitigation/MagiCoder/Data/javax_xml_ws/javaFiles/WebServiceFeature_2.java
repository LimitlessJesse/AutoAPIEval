import javax.xml.ws.WebServiceFeature;

public class WebServiceFeature_2 {
    public static void main(String[] args) {
        WebServiceFeature feature = new WebServiceFeature() {
            @Override
            public boolean isEnabled() {
                return true; // or false, depending on your needs
            }
        };

        System.out.println(feature.isEnabled());
    }
}
