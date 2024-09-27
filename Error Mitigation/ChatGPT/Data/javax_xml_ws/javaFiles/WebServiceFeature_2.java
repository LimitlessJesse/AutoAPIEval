import javax.xml.ws.WebServiceFeature;

public class WebServiceFeature_2 {
    public static void main(String[] args) {
        WebServiceFeature feature = new WebServiceFeature() {
            @Override
            public String getID() {
                return "unique_identifier";
            }
        };

        System.out.println("Feature ID: " + feature.getID());
    }
}
