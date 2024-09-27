import java.beans.Beans;

public class Beans_2 {
    public static void main(String[] args) {
        // Create a new bean
        MyBean bean = new MyBean();
        
        // Set the design time status of the bean
        Beans.setDesignTime(bean, true);
        
        // Print the design time status of the bean
        System.out.println("Design time status: " + Beans.isDesignTime(bean));
    }
}

class MyBean {
    // This is a placeholder for a real bean class
}
