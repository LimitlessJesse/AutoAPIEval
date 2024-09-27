import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class PropertyDescriptor_3 {
    public static void main(String[] args) {
        try {
            PropertyDescriptor pd = new PropertyDescriptor("name", Person.class);
            Method readMethod = pd.getReadMethod();
            System.out.println("Read method: " + readMethod.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class Person {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
