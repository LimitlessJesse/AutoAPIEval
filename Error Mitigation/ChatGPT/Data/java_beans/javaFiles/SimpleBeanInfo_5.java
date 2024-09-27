import java.beans.BeanInfo;
import java.beans.SimpleBeanInfo;

public class SimpleBeanInfo_5 {
    public static void main(String[] args) {
        SimpleBeanInfo simpleBeanInfo = new SimpleBeanInfo() {
            @Override
            public BeanInfo[] getAdditionalBeanInfo() {
                // Add your implementation here
                return null;
            }
        };
    }
}
