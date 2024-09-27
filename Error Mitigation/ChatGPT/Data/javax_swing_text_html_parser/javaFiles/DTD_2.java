import javax.swing.text.html.parser.DTD;
import javax.swing.text.html.parser.Entity;

public class DTD_2 {
    public static void main(String[] args) {
        DTD dtd = new DTD();
        Entity entity = dtd.getEntity("entityName");
        System.out.println(entity);
    }
}
