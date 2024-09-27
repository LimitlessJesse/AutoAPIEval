import javax.management.StandardMBean;

public class StandardMBean_5 {
    public static void main(String[] args) {
        StandardMBean standardMBean = new StandardMBean();
        String operationName = "someOperation";
        Object[] params = {1, "param"};
        String[] signature = {"int", "String"};
        
        try {
            Object result = standardMBean.invoke(operationName, params, signature);
            System.out.println("Result: " + result);
        } catch (MBeanException | ReflectionException e) {
            e.printStackTrace();
        }
    }
}
