import java.util.List;
import java.util.ResourceBundle;

public class ResourceBundle_Control_4 {
    public static void main(String[] args) {
        ResourceBundle.Control control = new ResourceBundle.Control() {
            @Override
            public List<String> getFormats(String baseName) {
                List<String> formats = new ArrayList<>();
                formats.add("java.class");
                formats.add("java.properties");
                return formats;
            }
        };

        List<String> formats = control.getFormats("example.base.name");
        System.out.println(formats);
    }
}
