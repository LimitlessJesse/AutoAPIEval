import java.awt.Container;
import java.awt.Label;

public class Container_3 {
    public static void main(String[] args) {
        Container container = new Container();
        
        Label label1 = new Label("Label 1");
        container.add(label1);
        
        Label label2 = (Label) container.getComponent(0);
        System.out.println("Component retrieved from index 0: " + label2.getText());
    }
}
