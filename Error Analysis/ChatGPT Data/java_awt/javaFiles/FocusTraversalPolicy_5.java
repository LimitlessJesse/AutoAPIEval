import java.awt.Component;
import java.awt.Container;
import java.awt.FocusTraversalPolicy;

public class FocusTraversalPolicy_5 {
    
    public static void main(String[] args) {
        Container container = new Container();
        
        Component lastComponent = getLastComponent(container);
        
        if(lastComponent != null){
            System.out.println("Last Component: " + lastComponent.toString());
        } else {
            System.out.println("Container does not have any components");
        }
    }

    public static Component getLastComponent(Container aContainer) {
        FocusTraversalPolicy policy = aContainer.getFocusTraversalPolicy();
        Component lastComponent = policy.getLastComponent(aContainer);
        
        return lastComponent;
    }
}
