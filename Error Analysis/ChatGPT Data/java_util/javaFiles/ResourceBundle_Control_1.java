import java.util.List;
import java.util.ResourceBundle;
import java.util.ResourceBundle.Control;

public class ResourceBundle_Control_1 {
    public static void main(String[] args) {
        List<String> formats = Control.getControl(Control.FORMAT_DEFAULT).getFormats("baseName");
        System.out.println(formats);
    }
}
